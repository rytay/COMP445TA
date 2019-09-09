#! /bin/sh
#
# start.sh
# Copyright (C) 2019 sebastien <sebastien@sebver>
#
# Distributed under terms of the MIT license.
#

# Compiles the java file and passes the argument to the program
javac client/httpc.java && java client.httpc $*

