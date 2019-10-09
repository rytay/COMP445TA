# Assignment 2

## Goal
Build a simple server-side remote file manager using the HTTP protocol.

Your server must respond to _GET_ and _POST_ requests as explained in the handout.

Make sure you limit the behaviour that a client can perform and handle errors.

## Reminder
For the networking aspect, you may __only__ use **Socket**, **ServerSocket** and the ones imported at the top of the [sample java file](./httpfs/httpfs.java).
Please carefully read the handout.

If you use other classes and/or higher level java libraries, you will get a heavy deduction on the assignment.

## Sample Code
If you look at the httpfs folder, there is a [sample server](./httpfs/httpfs.java) that uses **ServerSocket**.
It listents for an client to connect to it and then responds with a fixed string.

If you are to try it from the terminal, I'd suggest opening two windows. One to compile and run the server; and another for the client to connect to it.

### Server
If you're in this directory you can do: 
```
javac httpfs/httpfs.java && java httpfs.httpfs
```

### Client
You can use your `httpc` client that you made in the previous assignment or you could use `curl`.

Example using `curl`:
```
curl -v localhost:8080
```
