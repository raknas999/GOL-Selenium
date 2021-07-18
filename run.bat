set projectLocation=G:\seleniumTrg_Mav_ws\NareshIT
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testsuite.xml
