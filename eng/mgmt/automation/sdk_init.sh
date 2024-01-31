#!/bin/sh

apt-get install python3.8
apt-get install -y --upgrade python3-pip python3-setuptools

npm install @azure-tools/typespec-client-generator-cli

cat << EOF > $1
{}
EOF
