package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming05 {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>(); //We create this because I will use FP, In FP we need collections
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(CheckAverageScoreToBeGreaterThan91(coursesList,91));
        System.out.println(CheckAnyCourseNameContainsTurkish(coursesList));
        getCourseNameWhoseAvgIsTheHighest(coursesList);
        System.out.println(sortAvgAscSkipFirstTwo(coursesList));
        System.out.println(sortAvgAscGetYhird(coursesList));
    }

    //1)Create a method to check if all average scores are greater than 91
    public static boolean CheckAverageScoreToBeGreaterThan91(List<Course> coursesList, double avg) {

        return coursesList.stream().allMatch(t->t.getAverageScore()>91);
        //allMatch checks all results. If all true, it returns true
    }

    //2)Create a method to check if at least one of the courses names contains "Turkish" word.
    public static boolean CheckAnyCourseNameContainsTurkish(List<Course> coursesList) {

        return coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        //For anyMatch, just a sing true is enough. No need to check others
    }

    //3)Create a method to print the course whose average score is the highest
    public static void getCourseNameWhoseAvgIsTheHighest(List<Course> coursesList){

        Course result = coursesList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
        //get() method will remove optional data type and we will have Course data type.
        System.out.println(result);
    }

    //4)Sort the list elements according to the average score in ascending order and skip the first 2 elements
    public static List<Course> sortAvgAscSkipFirstTwo(List<Course> courseList){
        return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
    }

    //5)Sort the list elements according to the average score in ascending order and print just 3rd one
    public static List<Course> sortAvgAscGetYhird(List<Course> courseList){
        return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).limit(1).collect(Collectors.toList());
        //skip(2).limit(1) == ilk ikisini atla after, get first one, dont read the others
    }



}
