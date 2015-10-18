
ServoChannel luremouth = new ServoChannel (dyio.getChannel(1));
ServoChannel lureeyes = new ServoChannel (dyio.getChannel(1));

DigitalOutputChannel arm  = new DigitalOutputChannel(dyio.getChannel(23)); // arm
DigitalOutputChannel mouth  = new DigitalOutputChannel(dyio.getChannel(22)); // mouth
DigitalOutputChannel head = new DigitalOutputChannel(dyio.getChannel(21)); // head
DigitalOutputChannel claw   = new DigitalOutputChannel(dyio.getChannel(20)); // claw

def popup = {print "pop\n "; head.setHigh(true); arm.setHigh(true);}
def hide = {print "hide\n "; head.setHigh(false); arm.setHigh(false); mouth.setHigh(false);  claw.setHigh(false);}
def growl = {print "growl\n "; Runtime.getRuntime().exec("mpg123 /mnt/ramdisk/growl.mp3"); }




growl()
sleep(600);
popup()
 
sleep(6000)
hide()
