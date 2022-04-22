@echo off
set /p filename="filename: "
echo Press any key to compile.
pause
:loop
javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" %filename%.java
echo Compiling done, press any key to execute.
pause
java -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore %filename%
echo Press any key to compile again.
pause
goto loop