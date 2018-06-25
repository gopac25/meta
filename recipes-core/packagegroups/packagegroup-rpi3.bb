DESCRIPTION = "RaspberryPi Test Packagegroup"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

COMPATIBLE_MACHINE = "^rpi$"

RDEPENDS_${PN} = "\
    bcm2835-tests \
    wiringpi \
    rpio \
    rpi-gpio \
    pi-blaster \
    python-rtimu \
    python-sense-hat \
    connman \
    connman-client \
    crda \
    bluez5 \
"


