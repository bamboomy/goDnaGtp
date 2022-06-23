package genetic;
import java.util.ArrayList;
class Thought60 extends Thought{
private static ArrayList<Thought60> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 456.7571099820192;
private double fd1 = 937.8308172792603;
private Thought fo0 = null;
private Thought fo1 = null;
Thought60 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought60 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought60 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought60 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought60 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
        fb1 = fb0 && fb1;
    Output.points[3][1] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 257.19840774275457;
    ld0 *= -1;
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = lb2 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
    lb1 = fd1 > ld0;
    Thought lo3 = Thought88.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
    double ld4 = 991.0849376415973;
    fd0 = fd1 - ld0;

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
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought80.getInstance();
    boolean lb3 = false;
    double ld4 = 942.563081189524;
    double ld5 = 563.3400443204188;
    lb1 = lb3 || ab1;
    Output.points[3][2] -= ld4;
    double ld6 = 1000.0859916375044;
if(fo0 != null){
      fo1 = fo0.m4(ld5, ld6, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo7 = Thought89.getInstance(fo1, fo0, fo1, fo0);
    fb1 = !lb0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ld4, ld5, ld6, fd0, lb3, ab1, ab2, ab3);
}
    fd1 = ld4 - ld5;
    double ld8 = 556.8704774987101;
    ld6 = ld8 - fd0;
    if (ab4) {
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb3);
}
        Output.points[3][3] += fd1;
if(fo1 != null){
          ld4 = fo1.m3(ld5, ld6, ld8, fd0);
}
        Output.points[3][4] -= fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld4, ld5, ld6, ld8);
}
        fd0 = fd1 - ld4;
if(fo1 != null){
          ld5 = fo1.m3(ab1, ab2, ab3, ab4);
}
        ld6 = ld8 + fd0;
        Thought lo9 = Thought78.getInstance();
        fb0 = fb1 && lb0;
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
    fb1 = ad2 > ad3;
    ad4 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
    boolean lb0 = false;

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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought49.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought95.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
    Thought lo2 = Thought2.getInstance(ab4, fb0, fb1, ab1);
    ad4 *= -1;
    boolean lb3 = false;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ab1 = fo1.m2();
}
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        fd0 = fd1 + ad1;
        lb3 = ab1 && ab2;
        boolean lb4 = false;
        ad2 = ad3 - ad4;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
        double ld0 = 619.8861290099131;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    Output.points[3][5] -= fd0;
    Output.points[3][6] -= fd1;
if(ao3 != null){
      ao3.m1(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd1 = ld0 + fd0;

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
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = fb0 || fb1;
    fb0 = ad2 > ad3;
    double ld0 = 193.23388748217553;
    fb1 = ad3 < ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld1 = 195.44892368094423;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;

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
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(fb1, lb0, ab1, ab2);
}
    ab3 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought30.getInstance();
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        if (ab4) {
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3);
}
            fd0 = fd1 + fd0;
            fd1 *= -1;
            fd0 = fd1 + fd0;
if(ao4 != null){
              fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
}}
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    Output.points[3][7] -= ad4;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    boolean lb1 = true;
    Thought lo2 = Thought98.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ad1;
        Thought lo4 = Thought67.getInstance(lb1, lb3, ab1, ab2);
if(ao1 != null){
          fo1 = ao1.m4();
}
        ab3 = ad2 > ad3;
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[3][8] += fd1;
    double ld0 = 182.2498323186671;
    boolean lb1 = true;
    Thought lo2 = Thought53.getInstance(ld0, fd0, fd1, ld0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    lb1 = fd1 < ld0;
    fd0 = fd1 - ld0;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(lb1, lb3, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb1 = fo0.m2(fd1, ld0, fd0, fd1, lb3, fb0, fb1, lb1);
}
        ld0 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb3, fb0, fb1, lb1);
}
        boolean lb4 = true;
}
Thought.STACK_COUNTER++;
return lb3;
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
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
    if (ab4) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought81.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab3 = ab4 || fb0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        if (ab2) {
            fd1 = fd0 - fd1;
            ab3 = !ab4;
            fb0 = !fb1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            ab1 = fd0 < fd1;
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
            fb1 = ab1 || ab2;
            ab3 = ab4 || fb0;
            fb1 = fd1 > fd0;
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] -= ad1;
        ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 > fd1;
        fb0 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        double ld0 = 379.56392375174306;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        Thought lo2 = Thought59.getInstance();
        boolean lb3 = true;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb3, lb4, fb0, fb1);
}
        fd0 = fd1 - ld0;
        Thought lo5 = Thought70.getInstance(fo0, fo1, fo0, fo1);
        }
    double ld6 = 6.792412781184669;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld7 = 512.8603108334344;
    fb1 = ld6 < ld7;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    Output.points[4][1] += ad2;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
    ad1 *= -1;
    ab3 = ad2 < ad3;
    ab4 = fb0 || fb1;
    lb0 = ab1 && ab2;
    ad4 = fd0 - fd1;
    ab3 = !ab4;
    Thought lo1 = Thought13.getInstance();
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = lb0 && ab1;
    ab2 = ab3 && ab4;
    boolean lb2 = true;

Thought.STACK_COUNTER++;
return ab4;
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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(ao3 != null){
      fd1 = ao3.m3(fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought10.getInstance();
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb0;
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
    Thought lo0 = Thought37.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[4][2] -= fd1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(fb1, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb2 = false;
        double ld3 = 508.5168578206387;
if(ao2 != null){
          ao1 = ao2.m4(ld3, ad1, ad2, ad3, lb2, lb1, fb0, fb1);
}
        }

Thought.STACK_COUNTER++;
return lb1;
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
    fd0 *= -1;
    ab2 = ab3 || ab4;
        fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fd0 > fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
    fd1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab2 = ab3 && ab4;
    ad3 = ad4 - fd0;
    boolean lb2 = false;
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, lb1, lb2);
}
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        double ld3 = 328.5180998999185;
        Output.points[4][3] += ad1;
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 543.0912147460934;
    if (lb0) {
        Thought lo2 = Thought60.getInstance(ld1, fd0, fd1, ld1);
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
          fo1.m1(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
        fb0 = !fb1;
        Thought lo3 = Thought1.getInstance(fo1, fo0, fo1, fo0);
        boolean lb4 = true;
        boolean lb5 = true;
        fd1 = ld1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb4, lb5, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb4, lb5, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
          ld1 = fo0.m3(lb4, lb5, lb0, fb0);
}
        fb1 = fd0 < fd1;
        ld1 = fd0 + fd1;
        Thought lo6 = Thought88.getInstance();
        ld1 *= -1;
        Thought lo7 = Thought3.getInstance(fd0, fd1, ld1, fd0, lb4, lb5, lb0, fb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    Output.points[4][4] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, lb1);
}
    lb2 = fd1 > fd0;
    ab1 = !ab2;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought56.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    lb0 = !lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    lb1 = lb2 && ab1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Output.points[4][5] += fd0;
    Thought lo4 = Thought74.getInstance(fd1, fd0, fd1, fd0);
    ab2 = !ab3;

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
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    for(int i0=0; i0<10; i0++){
        double ld0 = 652.8907288419534;
        fb1 = !fb0;
        boolean lb1 = true;
        fb0 = fb1 && lb1;
        fd0 = fd1 + ld0;
        fb0 = ad1 < ad2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        double ld2 = 557.0419701502592;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
}
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
    boolean lb0 = true;
    Thought lo1 = Thought53.getInstance();
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = ad3 < ad4;
    fb0 = fd0 < fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld4 = 366.01091369799815;
    Thought lo5 = Thought97.getInstance(fb0, fb1, lb0, lb2);

Thought.STACK_COUNTER++;
return ad4;
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
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    fd1 *= -1;
    fb1 = !fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought0.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought86.getInstance(ad2, ad3, ad4, fd0);
    Thought lo2 = Thought51.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    Output.points[4][6] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > ad1;
    fb1 = fb0 || fb1;
    Thought lo3 = Thought88.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    ad2 = ad3 - ad4;

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
    ab1 = fd1 > fd0;
if(ao1 != null){
      ab2 = ao1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    ab2 = ab3 || ab4;
        fb0 = fb1 || lb0;
    fd1 *= -1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    boolean lb1 = false;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
    Thought lo2 = Thought32.getInstance(fo0, fo1, ao1, ao2);
    boolean lb3 = false;
    ab2 = ab3 && ab4;
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo5 = Thought40.getInstance(ao3, ao4, fo0, fo1, lb1, lb3, lb4, ab1);
    Thought lo6 = Thought18.getInstance(fd1, fd0, fd1, fd0);
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    Thought lo7 = Thought83.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ad1 = ao3.m3();
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought42.getInstance(fo1, ao1, ao2, ao3);
    boolean lb2 = false;
    double ld3 = 710.5981989196682;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ad1, ab4, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    lb2 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ld3, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb0 = fd0 > fd1;
    fb1 = ld3 > ad1;
    boolean lb4 = true;
        double ld5 = 667.3893058837303;
    ad1 = ad2 - ad3;
    Thought lo6 = Thought72.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3);
    lb0 = lb2 || lb4;
    boolean lb7 = true;
    if (lb7) {
        for(int i0=0; i0<10; i0++){
            Output.points[4][7] += ld5;
if(ao3 != null){
              ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
            boolean lb8 = true;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought13.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[4][8] += fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    double ld3 = 60.054298758646816;
    Thought lo4 = Thought9.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
    fd0 = fd1 + ld3;
    lb1 = lb2 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb2, fb0);
}
    fb1 = lb1 && lb2;
    fb0 = !fb1;
    fd0 *= -1;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 946.6136761567793;
    Output.points[5][0] -= ld0;
    Output.points[5][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld0;
    boolean lb1 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought83.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = false;
    lb1 = !fb0;
    fd0 = fd1 + ad1;
    Output.points[5][2] += ad2;
    fb1 = ad3 > ad4;
    Thought lo2 = Thought25.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
    fb0 = !fb1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb3, fb0, fb1);
}
    boolean lb4 = false;
    lb1 = ad3 < ad4;
    Output.points[5][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    lb3 = !lb4;
    fb0 = fb1 && lb1;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    boolean lb5 = false;
    lb3 = lb4 && lb5;
    fb0 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        boolean lb6 = false;
        boolean lb7 = true;
        boolean lb8 = true;
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 624.7926114881587;
    ad1 = ad2 - ad3;
    ab2 = !ab3;
    ab4 = ad4 > fd0;
    if (fb0) {
        boolean lb1 = true;
        fb0 = fd1 < ld0;
        Output.points[5][4] += ad1;
        fb1 = lb1 || ab1;
        ab2 = ad2 < ad3;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        Output.points[5][5] += ld0;
        lb1 = ab1 || ab2;
if(fo0 != null){
          ab3 = fo0.m2();
}
        double ld2 = 954.2878431267372;
        double ld3 = 656.5135742189701;
if(fo1 != null){
          fo1.m2(ld3, ld0, ad1, ad2, ab4, fb0, fb1, lb1);
}
        boolean lb4 = true;
        ad3 = ad4 - fd0;
        Output.points[5][6] += fd1;
        lb4 = ld2 > ld3;
        ab1 = ld0 > ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[5][7] += fd0;
        fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Output.points[5][8] += fd1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
        boolean lb1 = true;
    double ld2 = 581.2896360096678;
    ld2 = fd0 - fd1;
    lb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
    boolean lb3 = false;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fd1 *= -1;
    fb1 = ld2 < fd0;
    double ld4 = 198.24621690776834;
    double ld5 = 779.5692351001229;
    lb0 = ld5 < fd0;
    lb1 = lb3 || fb0;

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
        fb0 = ad1 < ad2;
    ad3 *= -1;
    Thought lo0 = Thought2.getInstance(fb1, fb0, fb1, fb0);
    if (fb1) {
        fb0 = fb1 && fb0;
        if (fb1) {
            Output.points[6][0] += ad4;
            fd0 *= -1;
if(ao3 != null){
              ao2 = ao3.m4();
}
            boolean lb1 = false;
            lb1 = fd1 < ad1;
            Output.points[6][1] += ad2;
            ad3 *= -1;
if(fo0 != null){
              ao4 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
            double ld2 = 66.00830841007662;
            ad1 = ad2 + ad3;
            fb1 = lb1 || fb0;
            Thought lo3 = Thought83.getInstance(fo1, ao1, ao2, ao3);
            fb1 = lb1 || fb0;
            ad4 = fd0 + fd1;
if(ao4 != null){
              ld2 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
}}
Thought.STACK_COUNTER++;
return ao3;
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
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao4 != null){
      ao4.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    lb1 = !ab1;
    double ld2 = 720.9161851955943;
    ab2 = !ab3;
    fd0 = fd1 - ld2;
    Output.points[6][2] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    double ld0 = 528.3692764881948;
    fd0 = fd1 - ld0;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    Thought lo1 = Thought90.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m3();
}
    Output.points[6][3] -= fd0;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    ad3 = ad4 + fd0;
    fd1 = ld0 - ad1;

Thought.STACK_COUNTER++;
return ao4;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld1 = 938.2431761286018;
    ld1 = fd0 - fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought54.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb3, fb0, fb1);
}
    lb0 = lb1 || lb3;
    boolean lb4 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb0);
}
    Thought lo5 = Thought15.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought17.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb1 = false;

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
