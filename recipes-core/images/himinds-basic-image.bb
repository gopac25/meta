# Base this image on rpi-basic-image

DESCRIPTION = "Himinds IOT gateway reference image."
LICENSE = "MIT"

include rpi-basic-image.bb
inherit core-image

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL = "\
    packagegroup-core-full-cmdline \
    packagegroup-base \
    packagegroup-rpi3 \
    libwebsockets \
    zeromq  \
    paho-mqtt-c \
    modemmanager \
    mosquitto  \
    hostapd \
    wpa-supplicant \
    wireless-tools \
    iw \
    iproute2 \
    dhcp-client \
    json-c \
    i2c-tools \
    git \
    nodejs \
    nodejs-npm \
    minicom \
"





