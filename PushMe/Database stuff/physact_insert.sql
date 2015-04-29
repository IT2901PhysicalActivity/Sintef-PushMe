DELETE FROM user_activity;
DELETE FROM user_steps;
DELETE FROM goal;
DELETE FROM user;
DELETE FROM activity;
DELETE FROM activity_level;
DELETE FROM tips;
DELETE FROM trophy;

INSERT INTO activity VALUES ("Aerobics",115,145,190);
INSERT INTO activity VALUES ("Badminton",100,150,170);
INSERT INTO activity VALUES ("Baseball",0,125,0);
INSERT INTO activity VALUES ("Basketball",130,195,220);
INSERT INTO activity VALUES ("Billiard",0,60,0);
INSERT INTO activity VALUES ("Bosu ball",0,120,0);
INSERT INTO activity VALUES ("Bowling",0,55,0);
INSERT INTO activity VALUES ("Boxing, competitive",0,213,0);
INSERT INTO activity VALUES ("Boxing, training",0,135,0);
INSERT INTO activity VALUES ("Canoeing",0,70,0);
INSERT INTO activity VALUES ("Climbing",0,264,0);
INSERT INTO activity VALUES ("Corebar",0,140,0);
INSERT INTO activity VALUES ("Corepulse",0,155,0);
INSERT INTO activity VALUES ("Coretraining",0,100,0);
INSERT INTO activity VALUES ("Crossfit",0,220,0);
INSERT INTO activity VALUES ("Cycling",93,160,200);
INSERT INTO activity VALUES ("Dancing",55,100,175);
INSERT INTO activity VALUES ("Dancestep",0,110,0);
INSERT INTO activity VALUES ("Dart",0,60,0);
INSERT INTO activity VALUES ("Elliptical trainer",130,200,270);
INSERT INTO activity VALUES ("Fencing",0,150,0);
INSERT INTO activity VALUES ("Floorball",100,170,200);
INSERT INTO activity VALUES ("Freediving",0,190,0);
INSERT INTO activity VALUES ("Frisbee",0,118,0);
INSERT INTO activity VALUES ("Golf, with cart",0,70,0);
INSERT INTO activity VALUES ("Golf, walking",0,100,0);
INSERT INTO activity VALUES ("Gymnastics",0,150,0);
INSERT INTO activity VALUES ("Handball",0,230,0);
INSERT INTO activity VALUES ("Hiking",155,180,235);
INSERT INTO activity VALUES ("Hula hoop",100,130,170);
INSERT INTO activity VALUES ("In-line skating",0,84,0);
INSERT INTO activity VALUES ("Icehockey",100,140,240);
INSERT INTO activity VALUES ("Ice skating",95,135,170);
INSERT INTO activity VALUES ("Judo",0,185,0);
INSERT INTO activity VALUES ("Lacrosse",0,200,0);
INSERT INTO activity VALUES ("Martial arts, various",120,140,240);
INSERT INTO activity VALUES ("Movement-training",0,110,0);
INSERT INTO activity VALUES ("Nordic walking",100,120,145);
INSERT INTO activity VALUES ("Orienteering",0,151,0);
INSERT INTO activity VALUES ("Pilates",0,70,0);
INSERT INTO activity VALUES ("Ping Pong",0,90,0);
INSERT INTO activity VALUES ("Racquetball",138,170,205);
INSERT INTO activity VALUES ("Rafting",0,125,0);
INSERT INTO activity VALUES ("Roller Skating",0,173,0);
INSERT INTO activity VALUES ("Rowing",75,150,289);
INSERT INTO activity VALUES ("Rugby",0,255,0);
INSERT INTO activity VALUES ("Running",185,230,305);
INSERT INTO activity VALUES ("Sailing",0,100,0);
INSERT INTO activity VALUES ("Sex",0,66,0);
INSERT INTO activity VALUES ("Scuba diving",0,190,0);
INSERT INTO activity VALUES ("Skiing, Cross country",110,220,330);
INSERT INTO activity VALUES ("Skiing, Downhill",60,90,150);
INSERT INTO activity VALUES ("Skiing, Roller",100,120,175);
INSERT INTO activity VALUES ("Skiing, Water",0,160,0);
INSERT INTO activity VALUES ("Skipping rope",100,200,285);
INSERT INTO activity VALUES ("Skydiving",0,90,0);
INSERT INTO activity VALUES ("Snowboarding",0,150,0);
INSERT INTO activity VALUES ("Snowshoeing",0,156,0);
INSERT INTO activity VALUES ("Soccer",144,166,195);
INSERT INTO activity VALUES ("Spinning",120,160,220);
INSERT INTO activity VALUES ("Squash",0,205,0);
INSERT INTO activity VALUES ("Stair climbing machine",0,160,0);
INSERT INTO activity VALUES ("Surfing",0,150,0);
INSERT INTO activity VALUES ("Swimming",120,225,290);
INSERT INTO activity VALUES ("Swimming, water aerobics",0,100,0);
INSERT INTO activity VALUES ("Swimming, treading water",0,98,0);
INSERT INTO activity VALUES ("Tai chi",0,8,0);
INSERT INTO activity VALUES ("Tennis, doubles",0,110,0);
INSERT INTO activity VALUES ("Tennis, singles",0,160,0);
INSERT INTO activity VALUES ("Volleyball, Beach",100,200,225);
INSERT INTO activity VALUES ("Volleyball, indoor",70,150,180);
INSERT INTO activity VALUES ("Weight lifiting",125,190,255);
INSERT INTO activity VALUES ("Windsurfing",0,100,0);
INSERT INTO activity VALUES ("Wrestling",120,150,300);
INSERT INTO activity VALUES ("Yoga",0,100,0);
INSERT INTO activity VALUES ("Zumba",0,130,0);

INSERT INTO activity_level VALUES (1,1,"Low");
INSERT INTO activity_level VALUES (2,2,"Med");
INSERT INTO activity_level VALUES (3,3,"High");

INSERT INTO user VALUES ("admin@admin", "123", "123", 20000101010101, 123, 123, "male", "low", "low");

INSERT INTO trophy VALUES (1, 1, "Week trophy, 28.04.2015", 20150428000000, 20150502000000, "admin@admin");

INSERT INTO goal VALUES (1, 45000, 20150425000000, 20150502000000, "week");
INSERT INTO goal VALUES (2, 900000, 20150401000000, 20150430000000, "month");
INSERT INTO goal VALUES (3, 45000, 20150501000000, 20150531000000, "month");
INSERT INTO goal VALUES (4, 55000, 20150410000000, 20150417000000, "week");

INSERT INTO tips VALUES(1, "Pick the parking-spot the farthest away from the shop.");
INSERT INTO tips VALUES(2, "Take a detour while walking to your buss.");
INSERT INTO tips VALUES(3, "Use the stairs!");
INSERT INTO tips VALUES(4, "Pushups/situps(get up) during tv commercials.");
INSERT INTO tips VALUES(5, "Go to the store if possible.");
INSERT INTO tips VALUES(6, "Use your bike!");
INSERT INTO tips VALUES(7, "Walk to work.");