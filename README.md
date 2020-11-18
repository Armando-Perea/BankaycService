# Bankayc Project

# bankayc 1.0.0

By Engr. Armando Perea Sanchez.

[![N|Solid]](https://nodesource.com/products/nsolid)[![Build Status](https://rgprincipal.com/es/wp-content/uploads/2018/12/Logo-de-Java-portada-250x122.jpg)

# Development Project Comments

  - I created a new Maven Project Using SpringBoot
  - I always try to apply the SOLID principles the closest I can, I might not be an expert but I try always to deliver a       clean and understandable code so my colleagues get an easy way to modify it!
  

# Application Run Guide

 - If you downloaded from git , please get the master branch which must have the lastest and ultimate version.
 - Compile the project as a maven project (mvn clean install)
 - Run the project as springboot Application, there are no VM Arguments
 - Default portservice is 8080

 
# Endpoints to process

## createUrl
POST EXAMPLE: http://localhost:8080/nearsoft/system/url-generator/createUrl
JSON BODY: 
{
    "url": "www.yahoo.com"
}

{
    "url": "www.google.com"
}
*** Observation Here, in the Requeirements was not specified to avoid any special character for url different from google or Yahoo, so, there are defects when using getOperationsByEngine if the URL contains any % (Special Character)
{
    "url": "www.oc34n5Deep458uiodkj.com"
}

## getUrlByAlias

GET EXAMPLE FOR GOOGLE : http://localhost:8080/nearsoft/system/url-generator/getUrlByAlias/dNtQc
{
    "url": "www.google.com"
}

GET EXAMPLE FOR YAHOO : http://localhost:8080/nearsoft/system/url-generator/getUrlByAlias/25HArvF
{
    "url": "www.yahoo.com"
}

GET EXAMPLE FOR OTHERS : http://localhost:8080/nearsoft/system/url-generator/getUrlByAlias/wwwcnsSXcm
{
    "url": "www.oc34ns56ASX78#.com"
}

## getAllUrl

GET EXAMPLE: http://localhost:8080/nearsoft/system/url-generator/getAllUrl
JSON RESPONSE: 
{
    "urlContent": {
        "www.yahoo.com": "25HArvF",
        "www.oc34ns56ASX78.com": "wwwcnsSXcm",
        "www.google.com": "dNtQc"
    }
}

## deleteUrlByEngine

DELETE EXAMPLE: http://localhost:8080/nearsoft/system/url-generator/deleteUrlByEngine/www.oc34ns56ASX78.com
RESPONSE:
URL WAS REMOVED SUCCESSFULY 

** Important, since there are no validations for urls special characters content, if the url was: www.oc34ns56AS%X78#.com
The response would be:
URL IS NOT ON THE LIST
Since the REST operation struggles with % # or any special character that affects it.

## clearUrls

DELETE EXAMPLE: http://localhost:8080/nearsoft/system/url-generator/clearUrls
RESPONSE:
URL WAS REMOVED SUCCESSFULY

## deleteUrlByAlias

DELETE EXAMPLE: http://localhost:8080/nearsoft/system/url-generator/deleteUrlByAlias/wwwcnsSXcm
RESPONSE:
URL CONTENT WAS CLEARED SUCCESSFULY


Please let me know if my development was accordingly and If there was a way to do it better, I would Appreciate it, no matter if I don't full fill your expectations, I'm always learning new things. Thanks for the opportunity!
