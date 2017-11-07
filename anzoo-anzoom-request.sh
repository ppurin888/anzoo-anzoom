#!/bin/sh

curl -v -i -X POST -H "Content-Type: application/json; charset=utf-8" -d @dummySignup.json http://localhost:8080/signup
