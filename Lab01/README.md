# Assignment
Build a client side program that partially emulates `curl`.

A few concepts that you'll need to brush up on:
* HTTP protocol and message format (stick to 1.0)
* [Socket connections](https://docs.oracle.com/javase/tutorial/networking/sockets/index.html)
* Message passing and reading

**Do not use `URLConnection` or `HTTPURLConnection` for the assignment**

# Instructions

Have `docker` installed.

## Build

Build the docker image with:

```bash
docker build -t httpc .
```

It's going to take a little bit of time to download and build.

## Run
To run the image:

```
docker run --rm httpc <args>
```

The `<args>` will behave like if you did `java httpc <args>`


