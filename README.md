# Ridango-train-demo-project

**This is a demo project for my Ridango Junior Java Developer job application.**

Spring boot based train REST API is a small train information system that allows users to trigger HTTP request for data processing.

## HTTP requests

API runs on a Tomcat server port:8080.

**GET all trains**

To get all trains from DB trigger a GET request on **URL:** *localhost:8080/trains/* receiving JSON that contains array of train objects.

###### example

<img src="https://github.com/JanarPeterson/Ridango-train-demo-project/blob/master/Images/GET%20example.png" alt="getall" width="514" height="282" />


**GET train by trainID**

For getting specific train information trigger a GET request with a trainID on the end of the regular GET request 
**URL:** *localhost:8080/trains/_trainID_*.

###### example

**URL:** *localhost:8080/trains/_28e8ea6f-8f68-4566-b21d-dc30693b73ae_*

<img src="https://github.com/JanarPeterson/Ridango-train-demo-project/blob/master/Images/GET%20By%20ID%20example.png" alt="getbyid" witdh="491" height="129" />


**UPDATE train information**

To update trains use a HTTP PUT 

**INSERT train to DB**

**DELETE train from DB**

