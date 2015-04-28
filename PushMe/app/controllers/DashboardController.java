package controllers;

import static play.data.Form.form;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import play.*;
import play.data.*;
import play.mvc.*;
import models.*;
import views.html.*;

public class DashboardController extends Controller {
	
	@Security.Authenticated(Secured.class)
	public static Result dashboard() {
        return ok(dashboard.render(User.find.byId(request().username()), Tips.all(), 0.0, getGoals()));
    }
	
	@Security.Authenticated(Secured.class)
	public static Result generateDailyBar(){
		double dailySteps = 0.0;
		Form<UserActivity> filledForm = form(UserActivity.class).bindFromRequest();
		Date date = filledForm.get().date;
		List<UserActivity> ua = UserActivityController.findUseractivities();
		for (UserActivity activity: ua) {
			if(activity.date.equals(date))
				dailySteps += activity.steps;
		} List<UserSteps> us = UserActivityController.findPedoRecordings();
		for (UserSteps step: us) {
			if(step.date.equals(date))
				dailySteps += step.steps;
		} return ok(dashboard.render(User.find.byId(request().username()), Tips.all(), dailySteps, getGoals()));
	}
	
    @Security.Authenticated(Secured.class)
    public static List<UserActivity> getUserActivities(){
    	User user = User.find.byId(request().username());
    	List<UserActivity> uas = UserActivity.all();
    	List<UserActivity> userUas = new ArrayList<UserActivity>();
    	for(UserActivity ua: uas){
    		if(ua.belongsTo.email.equals(user.email))
    			userUas.add(ua);
    	} return userUas;
    }
    
    @Security.Authenticated(Secured.class)
    public static List<UserActivity> getGlobalActivities(){
    	User user = User.find.byId(request().username());
    	List<UserActivity> uas = UserActivity.all();
    	List<UserActivity> userUas = new ArrayList<UserActivity>();
    	for(UserActivity ua: uas){
    		if(ua.belongsTo.email.equals(user.email))
    			userUas.add(ua);
    	} return userUas;
    }
    
    @Security.Authenticated(Secured.class)
    public static List<Integer> getSteps(Timestamp date){
    	User user = User.find.byId(request().username());
    	int stepsToday = 0;
    	int stepsWeek = 0;
    	int stepsMonth = 0;
    	List<UserSteps> us = UserSteps.all();
    	List<UserSteps> user_us = new ArrayList<UserSteps>();
    	
    	for(int i=0;i<us.size();i++){
    		if(us.get(i).belongsTo.email.equals(user.email)){
    			user_us.add(us.get(i));
    		}
    	}
    	
    	Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
//        Timestamp todate1 = cal.getTime().; 
    	for(int i=0;i<us.size();i++){
    		if(user_us.get(i).date.getDate() == date.getDate()){
    			user_us.add(us.get(i));
    		} if(user_us.get(i).date.getDate() == date.getDate()) {
    			
    		}
    	}
    	List<Integer> steps = new ArrayList<Integer>();	
    	
    	return steps;
    }
    
	public void updateMorris(User user) {
		//TODO: Update donut with the users activities
		//TODO: Update donut with everyone elses activities
	}
	
	public void updateStepProgressionBar() {
		//TODO: Update dayli progression bar with steps vs goal
		//TODO: Update weekly progression bar with steps vs goal
		//TODO: Update monthly progression bar with steps vs goal
	}
	
	public void createWeekGoal() {
		User user = User.find.byId(request().username());
		Goal goal = new Goal();
		goal.belongsTo = user;
		goal.steps = 70000; //TODO: add ActivityLevel
		Calendar cal = Calendar.getInstance();
		goal.start = cal.getTime();
		cal.add(Calendar.DATE, 7);
		goal.end = cal.getTime();
	}
	
	public void createMonthGoal() {
		User user = User.find.byId(request().username());
		Goal goal = new Goal();
		goal.belongsTo = user;
		goal.steps = 300000; //TODO add activityLevel
		Calendar cal = Calendar.getInstance();
		cal.set(cal.YEAR, cal.MONTH, 1);
		goal.start = cal.getTime();
		cal.set(cal.YEAR, cal.MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		goal.end = cal.getTime();
	}
	
	public static List<Goal> getGoals() {
		User user = User.find.byId(request().username());
    	List<Goal> goals = Goal.all();
    	List<Goal> userGoals = new ArrayList<Goal>();
    	for(Goal g: goals){
    		if(g.belongsTo.email.equals(user.email))
    			userGoals.add(g);
    	} return userGoals;
	}
}
