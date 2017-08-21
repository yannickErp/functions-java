String Timestamp(Date startDate, Date endDate) {

        //milliseconds
        long different = endDate.getTime() - startDate.getTime();


        long secondsInMilli = 1000;
        long minutesInMilli = secondsInMilli * 60;
        long hoursInMilli = minutesInMilli * 60;
        long daysInMilli = hoursInMilli * 24;
        long weeksInMilli = daysInMilli * 7;
        long monthsInMilli = daysInMilli * 30;
        long yearsInMilli = monthsInMilli * 12;


        elapsedYears = different / yearsInMilli;
        different = different % yearsInMilli;

        elapsedMonths = different / monthsInMilli;
        different = different % monthsInMilli;

        elapsedWeeks = different / weeksInMilli;
        different = different % weeksInMilli;

        elapsedDays = different / daysInMilli;
        different = different % daysInMilli;

        elapsedHours = different / hoursInMilli;
        different = different % hoursInMilli;

        elapsedMinutes = different / minutesInMilli;
        different = different % minutesInMilli;

        elapsedSeconds = different / secondsInMilli;


        if (elapsedYears == 0 && elapsedMonths == 0 && elapsedWeeks == 0 && elapsedDays == 0 && elapsedHours == 0 && elapsedMinutes == 0) {
            //show only Seconds
            FinalTimeStamp = "" + elapsedSeconds + "s";
        }
        else if (elapsedYears == 0 && elapsedMonths == 0 && elapsedWeeks == 0 && elapsedDays == 0 && elapsedHours == 0) {
            //show only Minutes
            FinalTimeStamp = "" + elapsedMinutes + "m";
        }
        else if (elapsedYears == 0 && elapsedMonths == 0 && elapsedWeeks == 0 && elapsedDays == 0){
            //show only Hours
            FinalTimeStamp = "" + elapsedHours + "h";
        }

        else if (elapsedYears == 0 && elapsedMonths == 0 && elapsedWeeks == 0){
            //show only Days
            FinalTimeStamp = "" + elapsedDays + "d";
        }

        else if (elapsedYears == 0 && elapsedMonths == 0){
            //show only Weeks
            if(elapsedWeeks <= 1){
                FinalTimeStamp = "" + elapsedWeeks + "wk";
            }
            else {
                FinalTimeStamp = "" + elapsedWeeks + "wks";
            }
        }

        else if (elapsedYears == 0){
            //show only Months
            if(elapsedMonths <= 1) {
                FinalTimeStamp = "" + elapsedMonths + "mo";
            }
            else{
                FinalTimeStamp = "" + elapsedMonths + "mos";
            }
        }

        else {
            //show only Years
            if(elapsedYears <= 1) {
                FinalTimeStamp = "" + elapsedYears + "y";
            }
            else{
                FinalTimeStamp = "" + elapsedYears + "ys";
            }
        }

        return FinalTimeStamp;
    }
