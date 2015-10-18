
ServoChannel luremouth = new ServoChannel (dyio.getChannel(1));
ServoChannel lureeyes = new ServoChannel (dyio.getChannel(1));

DigitalOutputChannel arm  = new DigitalOutputChannel(dyio.getChannel(23)); // arm
DigitalOutputChannel mouth  = new DigitalOutputChannel(dyio.getChannel(22)); // mouth
DigitalOutputChannel head = new DigitalOutputChannel(dyio.getChannel(21)); // head
DigitalOutputChannel claw   = new DigitalOutputChannel(dyio.getChannel(20)); // claw

def popup = {
    print "pop"; 
    head.setHigh(true); 
    arm.setHigh(true); 
    print " done \n ";
}

def hide = {
    print "hide";
    arm.setHigh(false);
    sleep(800)
    head.setHigh(false);
    mouth.setHigh(false);
    claw.setHigh(false);
    print " done \n ";
}

def growl = {
    print "growl";
    Runtime.getRuntime().exec("mpg123 /mnt/ramdisk/growl.mp3");
    print " done \n ";
}

def grab = {
    print "Grabbing "
    boolean clawstate = true;
    for (i=0; i<10; i++) {
        print "."
        claw.setHigh(clawstate);
        mouth.setHigh(clawstate);
        sleep(1000);
        clawstate = !clawstate;
    }
    print " done\n"
}


sleep(10000)
growl()
sleep(600);
popup()
sleep(1000);
grab();
hide();
