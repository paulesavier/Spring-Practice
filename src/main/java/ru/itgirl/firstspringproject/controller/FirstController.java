package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    enum Week {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "name", defaultValue = "MONDAY") String dayOfWeek) {

        Week weekday = Week.MONDAY;
        String finalDay;

        switch(dayOfWeek) {
            case "MONDAY":
                weekday = Week.MONDAY;
                break;
            case "TUESDAY":
                weekday = Week.TUESDAY;
                break;
            case "WEDNESDAY":
                weekday = Week.WEDNESDAY;
                break;
            case "THURSDAY":
                weekday = Week.THURSDAY;
                break;
            case "FRIDAY":
                weekday = Week.FRIDAY;
                break;
            case "SATURDAY":
                weekday = Week.SATURDAY;
                break;
            case "SUNDAY":
                weekday = Week.SUNDAY;
                break;
        }

        switch(weekday) {
            case MONDAY:
                finalDay = "Cегодня понедельник";
                break;
            case TUESDAY:
                finalDay = "Cегодня вторник";
                break;
            case WEDNESDAY:
                finalDay = "Cегодня среда";
                break;
            case THURSDAY:
                finalDay = "Cегодня четверг";
            break;
            case FRIDAY:
                finalDay = "Cегодня пятница";
            break;
            case SATURDAY:
                finalDay = "Cегодня суббота";
            break;
            case SUNDAY:
                finalDay = "Cегодня воскресенье";
            break;
            default:
                finalDay = ":(";
                break;
        }
        return finalDay;
    }

}
