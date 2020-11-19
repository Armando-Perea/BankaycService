# Bankayc Project

# bankayc 1.0.0

By Engr. Armando Perea Sanchez.

![Build Status](https://rgprincipal.com/es/wp-content/uploads/2018/12/Logo-de-Java-portada-250x122.jpg)

# Development Project Comments

  - I created a new Maven Project Using SpringBoot
  - I always try to apply the SOLID principles the closest I can, I might not be an expert but I try always to deliver a       clean and understandable code so my colleagues get an easy way to modify it!
  

# Application Run Guide

 - If you downloaded from git , please get the master branch which must have the lastest and ultimate version.
 - Compile the project as a maven project (mvn clean install)
 - Run the project as springboot Application, there are no VM Arguments
 - Default portservice is 8080

 
# Endpoints to process

## getAbilities
GET EXAMPLE: http://localhost:3001/pokeapi/getAbilities/ditto

RESPONSE:

[
    {
        "ability": {
            "name": "limber",
            "url": "https://pokeapi.co/api/v2/ability/7/"
        },
        "is_hidden": false,
        "slot": 1
    }
 ]

## id

GET EXAMPLE : http://localhost:3001/pokeapi/id/ditto

RESPONSE:

132

## getBaseExperience

GET EXAMPLE : http://localhost:3001/pokeapi/id/ditto

RESPONSE:

101

## getHeldItems

GET EXAMPLE : http://localhost:3001/pokeapi/getHeldItems/ditto

RESPONSE:

[
    {
        "item": {
            "name": "metal-powder",
            "url": "https://pokeapi.co/api/v2/item/234/"
        },
        "version_details": [
            {
                "rarity": 5,
                "version": {
                    "name": "ruby",
                    "url": "https://pokeapi.co/api/v2/version/7/"
                }
            }, ...................................................


## getName

GET EXAMPLE : http://localhost:3001/pokeapi/getName/ditto

RESPONSE:

ditto


## getLocationAreaEncounters

GET EXAMPLE : http://localhost:3001/pokeapi/getLocationAreaEncounters/ditto

RESPONSE:

https://pokeapi.co/api/v2/pokemon/132/encounters

## Please!

Please let me know if my development was accordingly and If there was a way to do it better, 
I would Appreciate it, no matter if I don't full fill your expectations, 
I'm always learning new things. Thanks for the opportunity!

