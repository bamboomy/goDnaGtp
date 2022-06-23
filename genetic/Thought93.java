package genetic;
import java.util.ArrayList;
class Thought93 extends Thought{
private static ArrayList<Thought93> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 328.429621817746;
private double fd1 = 504.8629785359802;
private Thought fo0 = null;
private Thought fo1 = null;
Thought93 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought93 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought93 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought93 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought93 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought93 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought93 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought93 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought93 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[0][6] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    lb1 = fd1 < fd0;
    fd1 *= -1;
    if (fb0) {
        fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          lb0 = fo1.m2();
}
        Output.points[0][7] -= fd1;
if(fo0 != null){
          lb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Output.points[0][8] -= fd0;
        fd1 = fd0 + fd1;
    ab4 = fb0 || fb1;
    double ld0 = 540.1081162312246;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, ab1, ab2, ab3);
}
    ld0 *= -1;
if(fo0 != null){
      ab4 = fo0.m2();
}
    double ld1 = 280.23841717822114;
    double ld2 = 45.11514743284322;
    fb0 = ld1 < ld2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[1][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 400.60452225708616;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    Output.points[1][1] += fd0;
    fb1 = fb0 && fb1;
    fd1 = ld0 + ad1;
    ad2 *= -1;
    fb0 = !fb1;
    Thought lo1 = Thought16.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    double ld2 = 314.2383103051879;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Output.points[1][2] += ld0;
    ld2 *= -1;
    boolean lb3 = true;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3();
}
    lb3 = fb0 && fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    double ld0 = 427.45846602005923;
    ad1 = ad2 - ad3;
    Output.points[1][3] -= ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
    boolean lb1 = true;
    double ld2 = 984.8250306446035;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][4] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    Thought lo0 = Thought75.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = true;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 *= -1;
    boolean lb0 = true;
    fd0 = fd1 - ad1;
    lb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Output.points[1][5] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = ad4 > fd0;
    Thought lo1 = Thought61.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
    ad4 = fd0 - fd1;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    Output.points[1][6] -= ad1;
    fb1 = !lb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
if(ao1 != null){
      ab3 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
if(ao1 != null){
      fd1 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
    Thought lo0 = Thought16.getInstance();
        Thought lo1 = Thought12.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    Thought lo2 = Thought90.getInstance(ao2, ao3, ao4, fo0);
    Output.points[1][7] -= fd0;
    ab4 = fd1 > fd0;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    double ld3 = 195.6516714089641;
    ab2 = !ab3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][8] -= ad2;
    ab2 = ad3 < ad4;
    double ld0 = 802.2579781398663;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld1 = 104.43873970536072;
    Thought lo2 = Thought15.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
    Thought lo3 = Thought86.getInstance(ad3, ad4, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld1, ad1, ad2);
}
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Output.points[2][0] += fd1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought28.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    if (ab2) {
        Thought lo0 = Thought69.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        Output.points[2][1] -= fd0;
        ab3 = ab4 && fb0;
        fb1 = fd1 < fd0;
        Thought lo1 = Thought16.getInstance(ab1, ab2, ab3, ab4);
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo1.m3();
}
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            boolean lb2 = false;
            boolean lb3 = false;
            ab1 = !ab2;
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
            lb2 = fd0 < fd1;
            boolean lb4 = true;
            Output.points[2][2] += fd0;
            lb3 = lb4 || ab1;
            fd1 = fd0 - fd1;
            if (ab2) {
                fd0 = fd1 + fd0;
                ab3 = ab4 || fb0;
}}}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
    if (fb1) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought70.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb1 = false;
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
        fb0 = !fb1;
        fd0 *= -1;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
        Thought lo3 = Thought10.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
        } else {
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        ad3 = ad4 - fd0;
        double ld4 = 468.8447060481552;
        fd0 = fd1 - ld4;
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
        Output.points[2][3] -= ad1;
if(fo0 != null){
          fb1 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        Output.points[2][4] -= fd1;
        fb0 = ld4 < ad1;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab1 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[2][5] -= ad2;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[2][6] -= fd0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][7] += fd1;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      lb0 = ao2.m2();
}
        Output.points[2][8] -= fd0;
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought6.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought1.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[3][0] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = ad1 - ad2;
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
    Output.points[3][1] += fd1;
    fb1 = ad1 < ad2;
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought1.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(ao2 != null){
      fd0 = ao2.m3();
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    Output.points[3][2] -= fd1;
    boolean lb1 = true;
    double ld2 = 731.6728995309842;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    ld2 = fd0 + fd1;
    double ld3 = 261.89644875107217;
    ld2 = ld3 - fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld2, ld3, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ld2, ld3, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld3, fd0, fd1);
}
    ld2 = ld3 + fd0;
    double ld4 = 607.9969903211206;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ld2, ld3, fb1, lb0, lb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought61.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
    ab3 = fd1 > ad1;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
    double ld1 = 602.4323305191177;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = ld1 < ad1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    lb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
        fd1 *= -1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    Thought lo2 = Thought13.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2();
}
    boolean lb3 = true;
    double ld4 = 749.8926150146111;

Thought.STACK_COUNTER++;
return ld4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Output.points[3][3] -= fd1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    fd1 = fd0 - fd1;
    fb1 = lb0 && ab1;
    double ld1 = 616.4141976062803;
if(fo0 != null){
      ab2 = fo0.m2(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, ab1, ab2);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fd1 > ad1;
    boolean lb0 = true;
    lb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 < ad3;
    Thought lo1 = Thought85.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
    double ld3 = 884.3695920159857;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, lb2, lb4, fb0);
}
    boolean lb5 = true;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb4 = fo0.m2(ad1, ad2, ad3, ad4);
}
        lb5 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
        fb0 = ad4 < fd0;
        fd1 *= -1;
if(fo0 != null){
          fb1 = fo0.m2(lb0, lb2, lb4, lb5);
}
        ld3 *= -1;
        if (fb0) {
}}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][4] += ad1;
    ab2 = !ab3;
    boolean lb0 = true;
    Thought lo1 = Thought63.getInstance();
    double ld2 = 16.754768309650522;
    ab3 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
        ab3 = ld2 < ad1;
    ad2 *= -1;
    ab4 = ad3 < ad4;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo4 = Thought46.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb0, fb1, lb0, lb3);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld2, ad1);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    double ld0 = 23.287075249182887;
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m1();
}
    ld0 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
if(ao3 != null){
          ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
    boolean lb2 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    boolean lb3 = true;
    ad4 *= -1;
    lb1 = lb2 && lb3;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    Output.points[3][5] += fd0;
    Thought lo0 = Thought47.getInstance(ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    double ld1 = 810.0269153380115;
    ab4 = fb0 || fb1;
    Thought lo2 = Thought62.getInstance(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
    ab2 = !ab3;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    ab4 = fb0 && fb1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2();
}
    boolean lb1 = true;
    boolean lb2 = true;
if(ao3 != null){
      lb1 = ao3.m2(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = lb0 || lb1;
    boolean lb3 = false;
    Output.points[3][6] += fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    double ld2 = 0.8097721454625781;
    ld2 = fd0 - fd1;
    double ld3 = 841.4518099456574;
    boolean lb4 = true;
if(fo0 != null){
      ld2 = fo0.m3(ld3, fd0, fd1, ld2);
}
    fb0 = ld3 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, ld3, fd0);
}
    fb1 = lb1 && lb4;
    fb0 = fb1 || lb1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought0.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    Output.points[3][7] += fd1;
    Thought lo1 = Thought2.getInstance(fd0, fd1, fd0, fd1);
    double ld2 = 740.1914632004854;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld0 = 139.41329755280103;
    fb1 = fb0 && fb1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought41.getInstance();
    Output.points[3][8] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought77.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
    fb0 = ad3 > ad4;
    boolean lb3 = false;
    fb0 = !fb1;
    fd0 *= -1;
    fd1 *= -1;
    lb3 = ld0 > ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 575.2743748750038;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
    fd1 = ld0 - ad1;
    double ld1 = 823.4654582888393;
    boolean lb2 = false;
    Output.points[4][0] -= ad1;
    fb0 = fb1 || lb2;
    ad2 = ad3 - ad4;
    ab1 = ab2 && ab3;
    double ld3 = 781.3506429890546;
    ad4 *= -1;
    fd0 *= -1;
    fd1 = ld0 + ld1;
    Output.points[4][1] -= ld3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 869.8526197326147;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < ld0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld2 = 647.6438733015007;
    lb1 = !fb0;
    boolean lb3 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
}
    ld2 = fd0 - fd1;
        fb0 = ld0 < ld2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, lb3, fb0);
}
    Thought lo4 = Thought33.getInstance(fd0, fd1, ld0, ld2);
    Thought lo5 = Thought54.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld2);
    boolean lb6 = false;
    boolean lb7 = false;
    lb7 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(lb1, lb3, lb6, lb7);
}
if(fo1 != null){
      fo1.m2();
}
    fb0 = fd0 > fd1;
    ld0 *= -1;
    fb1 = !lb1;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    boolean lb0 = false;
    Thought lo1 = Thought3.getInstance(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought14.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
    for(int i0=0; i0<10; i0++){
        Output.points[4][2] += fd1;
        fb1 = ad1 < ad2;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        ad1 *= -1;
        }
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    double ld0 = 888.4706043107694;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2();
}
    Thought lo1 = Thought11.getInstance(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    fd0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    ab1 = ab2 && ab3;
    Thought lo2 = Thought59.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ld0 = fd0 - fd1;
    double ld3 = 776.6101202414567;
    fb1 = ld0 < ld3;
    Thought lo4 = Thought97.getInstance(fd0, fd1, ld0, ld3);
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld3);
}
    fb1 = fd0 < fd1;
    ld0 = ld3 - fd0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Output.points[4][3] -= ad4;
    Thought lo0 = Thought47.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    double ld2 = 977.5728576895607;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld2 *= -1;
    fd0 = fd1 - ld2;
    Output.points[4][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb3 = false;
    boolean lb4 = false;
    lb0 = !lb1;
    Output.points[4][5] -= ld2;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    double ld0 = 770.508623849498;
    boolean lb1 = true;
    double ld2 = 433.4331915028844;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
    lb1 = ld0 > ld2;
    Thought lo3 = Thought83.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      fd0 = fo1.m3(lb1, fb0, fb1, lb1);
}
    fd1 = ld0 - ld2;
    fb0 = !fb1;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2, lb1, lb4, fb0, fb1);
}
    boolean lb5 = true;
    Output.points[4][6] += fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought63.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought84.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fb1, lb2, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      lb2 = fo1.m2();
}
    boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb3);
}
    double ld4 = 210.92343541684502;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    fb1 = lb2 && lb3;
    Thought lo5 = Thought53.getInstance(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, fb0, fb1, lb2, lb3);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, lb3, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
