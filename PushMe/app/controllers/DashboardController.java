package controllers;

import static play.data.Form.form;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import play.*;
import play.data.*;
import play.mvc.*;
import models.*;
import views.html.*;

public class DashboardController extends Controller {
	
	@Security.Authenticated(Secured.class)
	public static Result dashboard() {
        return ok(dashboard.render(User.find.byId(request().username()), Tips.all()));
    }
	
    @Security.Authenticated(Secured.class)
    public static List<UserActivity> getUserActivities(){
    	User user = User.find.byId(request().username());
    	List<UserActivity> ua = UserActivity.all();
    	List<UserActivity> user_ua = new ArrayList<UserActivity>();
    	for(int i=0;i<ua.size();i++){
    		if(ua.get(i).belongsTo.email.equals(user.email)){
    			user_ua.add(ua.get(i));
    		}
    	}
    	return user_ua;
    }
    
    @Security.Authenticated(Secured.class)
    public static List<UserActivity> getGlobalActivities(){
    	User user = User.find.byId(request().username());
    	List<UserActivity> ua = UserActivity.all();
    	List<UserActivity> user_ua = new ArrayList<UserActivity>();
    	for(int i=0;i<ua.size();i++){
    		if(ua.get(i).belongsTo.email.equals(user.email)){
    			user_ua.add(ua.get(i));
    		}
    	}
    	return user_ua;
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
}
