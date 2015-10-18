print "hello world "
BowlerStudio.speak("Welcome to Bowler Studio");

ServoChannel luremouth = new ServoChannel (dyio.getChannel(1));
ServoChannel lureeyes = new ServoChannel (dyio.getChannel(1));

DigitalOutputChannel arm  = new DigitalOutputChannel(dyio.getChannel(23)); // arm
DigitalOutputChannel mouth  = new DigitalOutputChannel(dyio.getChannel(22)); // mouth
DigitalOutputChannel head = new DigitalOutputChannel(dyio.getChannel(21)); // head
DigitalOutputChannel claw   = new DigitalOutputChannel(dyio.getChannel(20)); // claw

def popup = {head.setHigh(true); arm.setHigh(true);}
def hide = {head.setHigh(false); arm.setHigh(false); mouth.setHigh(false); }
def growl = {Runtime.getRuntime().exec("mpg123 /home/teacher/git/oscar-trashbot/growl.mp3"); delay(1000); mouth.setHigh(true); }

sleep(1000)
popup()
growl()
sleep(5000)
hide()
