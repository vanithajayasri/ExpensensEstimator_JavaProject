Project name: Living Expenses Estimator
==============================================================
Description:
++++++++++++
When you plan to move to a new state your first question in mind is "WHAT WOULD BE THE COST OF LIVING? AND HOW FAR MY SALARY WOULD GO IN THE NEW STATE?" 
This application is mainly focused on providing you an approximate budget fluctuation as you move from one state to another in the United States of America.
Based on your income and type of requirements you are provided with an average monthly budget for that state.
The application mainly takes into consideration 50 US states.
Expenditures mainly are identified as your accomodation expenses, taxes, transportation costs, food expenses and other miscellaneous costs. 
=============================================================================================================================================================
System requirements:
====================
Any program editor such as text pad, eclipse or springtools
jdk1.8.0_05
apache-tomcat-7.0.69
SQLite3
related dependent files can be asccesed from the dependent files folders.
=========================================================================================================
Installation instructions:
===========================
-Install the above mentioned requirements from following links:
-for installing apache-tomcat you may refer https://tomcat.apache.org/tomcat-7.0-doc/building.html
-for installing SQLite3 refer to http://www.tutorialspoint.com/sqlite/sqlite_installation.htm

Once reqiurements are installed
=================================
-Import the project folder "exspenses java project" on your java compiler.
-Import the two jars Sqlite: sqlite-jdbc-3.8.11.2.jar and Project jar
-Copy the databse file Relocating_Cost.db and Relocating Cost prvided in the dependent files\sqlite in your sqlite folder. 
for example: c:\Sqlite\ Relocating_Cost; c:\Sqlite\ Relocating_Cost.db

-To create the database refer to the   file "database_java_project_final.txt" in the dependent files folder.
=============================================================================================================
Operating Instructions:
========================
-Run the signIn.jsp file present in the WebContent folder of the project through the apache tomcat server.
-A welcome page will be displayed
 -You will be asked to sign in and submit query on this page.
 -If you are already signed in to the application you will be diverted to next page on pressing "Submit Query"
 -However if you arer not signed up, you will be directed to a SignUp Form.
 -Here, enter the required details and press "Submit Query".
 -Now you can Login using your username and password.
-A user expense form will be dispalyed.
 -Here enter details of your interest and press "Submit Query".
-An output page diaplying an average Expenses Estimator will be displayed on the screen.
-Now you can logout.
================================================================================================================
Your login details and all the data that is calculated for you is stored in the database Relocating_Cost.db
==================================================================================================================
A sample input that can be run on application can be found in the Java Term Project Documentation.pdf file provided in the folder.







