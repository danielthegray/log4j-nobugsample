# Sample of correct Log4J behavior

This is a small CLI app build to showcase a bug that is occurring in the SLF4J binding
to Log4J, where the log line number is incorrect.

This is the Log4J-only version, which correctly logs the line numbers.

To execute it, run:

    ./gradlew run

and you should see the following output from the task:

    STARTED SUCCESFULLY
    2020-06-25 12:13:58,113  INFO [main] (log4j2.bugsample.App:14) - INFO message with no lambdas
    2020-06-25 12:13:58,115  INFO [main] (log4j2.bugsample.App:15) - INFO message with a lambda function result = MESSAGE FROM LAMBDA
    2020-06-25 12:13:58,116  INFO [main] (log4j2.bugsample.App:25) - INFO message with a method reference METHOD MESSAGE
    ENDED SUCCESFULLY

As you can see the log line numbers are correct.
