package genetic;
import java.util.ArrayList;
class Thought12 extends Thought{
private static ArrayList<Thought12> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 427.4533428769382;
private double fd1 = 906.5673796935145;
private Thought fo0 = null;
private Thought fo1 = null;
Thought12 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought12 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought12 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought12 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought12 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[3][2] += fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 656.5772239566589;
    boolean lb1 = true;
    lb1 = ld0 < fd0;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb1, fb0, fb1);
}
    double ld2 = 200.0220630096232;
    lb1 = fb0 || fb1;
    ld0 = ld2 - fd0;
    Thought lo3 = Thought5.getInstance(fd1, ld0, ld2, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0, lb1, lb4, fb0, fb1);
}
    double ld5 = 828.5090102851482;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2, lb1, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld0);
}
    lb1 = ld2 > ld5;
    lb4 = !fb0;
    fb1 = lb1 && lb4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    ld0 = ld2 - ld5;

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
    double ld0 = 654.9566461898646;
    fd0 *= -1;
    Output.points[3][3] -= fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld1 = 251.01965299160736;
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    ab3 = ld0 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought8.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb1 = !fb0;
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    double ld2 = 100.47112687328544;
    lb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      lb1 = fo0.m2();
}
    boolean lb3 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    double ld0 = 815.5989368134733;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    Output.points[3][4] -= ad1;
    double ld1 = 315.8642144653202;

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
    double ld0 = 861.5097720627808;
    fb0 = fb1 || fb0;
    ld0 *= -1;
    Output.points[3][5] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
    lb2 = fb0 || fb1;
    lb1 = ld0 < fd0;
    lb2 = fb0 && fb1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld0 = 377.68123736471193;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    fb1 = ld0 < ad1;
    fb0 = ad2 < ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = ad4 > fd0;
    fb1 = fd1 > ld0;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Output.points[3][6] += fd0;
    fb1 = !ab1;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
        ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = fd0 < fd1;
        ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
        fd0 = fd1 - fd0;
    double ld1 = 347.1548480631733;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[3][7] += ad1;
    ab1 = !ab2;
    ab3 = !ab4;
    fb0 = ad2 > ad3;
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    ab1 = ab2 && ab3;
    ab4 = ad2 < ad3;
    Thought lo0 = Thought1.getInstance();
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;

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
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 421.888708223475;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    Output.points[3][8] -= fd0;

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
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    fd0 *= -1;
    ab4 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 && ab2;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[4][0] -= fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 + ad3;
    double ld0 = 162.45708014744417;
    fb0 = ad3 > ad4;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought1.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb1 = fd0 < fd1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
    lb2 = lb3 || fb0;
    ld0 = ad1 + ad2;
    fb1 = lb2 || lb3;
    ad3 = ad4 + fd0;
    if (fb0) {
        fd1 = ld0 - ad1;
        Thought lo4 = Thought14.getInstance(fb1, lb2, lb3, fb0);
        fb1 = ad2 < ad3;
        lb2 = lb3 && fb0;
        fb1 = !lb2;
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ld0);
}
        Thought lo5 = Thought5.getInstance(fo1, fo0, fo1, fo0);
        if (lb3) {
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb2, lb3, fb0);
}
            fb1 = lb2 || lb3;
            Thought lo6 = Thought8.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, lb2, lb3);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[4][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    ab2 = ad3 < ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    double ld1 = 107.91774143915904;
    ad3 *= -1;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought1.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = true;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = !lb0;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    lb0 = fd1 < fd0;
    fd1 *= -1;
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
        fb1 = !lb0;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    double ld3 = 288.4836342788103;

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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought15.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought14.getInstance();
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        boolean lb3 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb3);
}
        lb0 = ad1 > ad2;
        double ld4 = 952.980661130279;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb3, lb0);
}
        Output.points[4][2] -= fd1;
        Thought lo5 = Thought10.getInstance(ao4, fo0, fo1, ao1, ld4, ad1, ad2, ad3);
        Thought lo6 = Thought11.getInstance();
        ad4 *= -1;
        boolean lb7 = true;
        lb0 = fb0 || fb1;
        fd0 *= -1;
        fd1 = ld4 + ad1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Thought lo0 = Thought0.getInstance(fd1, fd0, fd1, fd0);
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    Thought lo1 = Thought11.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought14.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb3, ab1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    Output.points[4][3] += ad1;
    Output.points[4][4] += ad2;
    Output.points[4][5] -= ad3;
    Output.points[4][6] -= ad4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    if (ab3) {
        Thought lo1 = Thought1.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
if(ao2 != null){
          ao2.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        ad2 *= -1;
        fb0 = fb1 && lb0;
        ad3 = ad4 - fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ad1;
if(ao2 != null){
          ad2 = ao2.m3();
}
        boolean lb2 = true;
        lb0 = ab1 && ab2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ad3 = ao3.m3(lb2, lb0, ab1, ab2);
}
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought16.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        Thought lo2 = Thought12.getInstance();
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought15.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 || fb1;
    fd0 *= -1;
    lb1 = lb2 || ab1;
    boolean lb3 = false;
    boolean lb4 = true;
    lb4 = fd1 < fd0;
    ab1 = !ab2;
    double ld5 = 648.0847039578297;
    Thought lo6 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd1, ld5, fd0, fd1, lb1, lb2, lb3, lb4);
}
if(fo1 != null){
      ld5 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb7 = true;
    fd1 = ld5 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb7, ab1, ab2, ab3);
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought17.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fb0 && fb1;
    Output.points[4][7] += ad2;
    Thought lo1 = Thought13.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    lb2 = fb0 || fb1;
    ad4 = fd0 - fd1;
    lb2 = !fb0;

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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought12.getInstance();
    Thought lo1 = Thought16.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    ad2 *= -1;
    Thought lo2 = Thought17.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ad3 > ad4;
    double ld3 = 822.6577780871863;
    ab1 = ad4 < fd0;
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld3, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb4 = true;
}
Thought.STACK_COUNTER++;
return ad3;
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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3();
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, fd0, fd1);
}
    double ld1 = 110.70339019574206;
    double ld2 = 495.72389109188595;
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return ld1;
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
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
    boolean lb2 = false;
    double ld3 = 13.021746144722545;
    boolean lb4 = false;
    lb4 = fb0 || fb1;
    lb0 = lb1 && lb2;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        lb4 = fb0 && fb1;
        boolean lb5 = false;
        lb5 = !lb0;
        ad3 = ad4 - fd0;
        fd1 = ld3 - ad1;
        lb1 = ad2 < ad3;
        lb2 = !lb4;
        boolean lb6 = false;
        boolean lb7 = true;
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld3, ad1, lb2, lb4, fb0, fb1);
}
        }
    Thought lo8 = Thought3.getInstance(ad2, ad3, ad4, fd0, lb0, lb1, lb2, lb4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld3, ad1, ad2);
}

Thought.STACK_COUNTER++;
return ad3;
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
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought8.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    double ld1 = 449.52200496577916;
    fb1 = ab1 || ab2;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld1);
}
    boolean lb3 = true;
    fb0 = fb1 || lb2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + ld1;
        fd0 = fd1 + ld1;
    lb3 = !ab1;
    double ld4 = 467.03857335143334;
    Thought lo5 = Thought17.getInstance(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
    boolean lb6 = false;
    boolean lb7 = true;
    boolean lb8 = true;
    ab3 = !ab4;
    Thought lo9 = Thought11.getInstance(ld4, fd0, fd1, ld1, fb0, fb1, lb2, lb3);
    double ld10 = 478.5637672536984;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 + ad3;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m3();
}
    Output.points[4][8] -= ad2;
    Thought lo0 = Thought12.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought10.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      ab1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ad1;
    Thought lo3 = Thought10.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
    boolean lb4 = true;
    fd1 = ad1 - ad2;
    double ld5 = 654.9040769807793;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fd1 = ld5 + ad1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb2, lb4, ab1);
}
if(fo0 != null){
      ad2 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}

Thought.STACK_COUNTER++;
return ld5;
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        boolean lb0 = false;
        fb0 = fd1 < fd0;
        double ld1 = 741.9264291998528;
        fb1 = !lb0;
        Output.points[5][0] += fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        boolean lb2 = true;
        fd1 *= -1;
        if (lb0) {
            } else if (lb2) {
            } else if (fb0) {
            Output.points[5][1] -= ld1;
            boolean lb3 = false;
            fd0 = fd1 - ld1;
            for(int i0=0; i0<10; i0++){
if(fo0 != null){
                  fo1 = fo0.m4();
}
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb0);
}
                boolean lb4 = true;
                fd0 = fd1 + ld1;
                Output.points[5][2] += fd0;
                lb0 = !lb2;
}}}
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
    ab1 = !ab2;
    boolean lb0 = true;
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    Thought lo1 = Thought5.getInstance(fb0, fb1, lb0, ab1);
    if (ab2) {
        double ld2 = 413.0232187226283;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ab3 = fd1 > fd0;
        double ld3 = 515.8504283997869;
        fd0 = fd1 + ld3;
        fd0 = fd1 + ld3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld3, fd0, fd1, ab4, fb0, fb1, lb0);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[5][3] += ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    ad3 *= -1;
    ad4 = fd0 - fd1;
    fb1 = ad1 > ad2;
    double ld1 = 791.6735921785665;
    Thought lo2 = Thought8.getInstance();
    fb0 = ad2 < ad3;
    Output.points[5][4] += ad4;
    fd0 = fd1 - ld1;
    fb1 = ad1 < ad2;
    Thought lo3 = Thought4.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ld1 = ad1 - ad2;
    Thought lo4 = Thought7.getInstance(fo0, fo1, fo0, fo1);
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb5, fb0, fb1, lb5);
}
    ld1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb5, fb0);
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
    ab1 = !ab2;
    ad1 *= -1;
    ad2 *= -1;
    Output.points[5][5] -= ad3;
    double ld0 = 859.6816381043957;
    double ld1 = 692.5133583630852;
    ab3 = ad2 < ad3;
    ad4 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    boolean lb3 = true;
    Thought lo4 = Thought18.getInstance();
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld5 = 730.6563325580047;
if(fo0 != null){
      fo0.m3(fb1, lb2, lb3, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld5, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab2 = ab3 && ab4;

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
        boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought13.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
    fd0 *= -1;
    Output.points[5][6] -= fd1;
    lb0 = lb1 && fb0;
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought5.getInstance();
    fd0 *= -1;
    boolean lb5 = false;
    fd1 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, lb1, lb3, lb5, fb0);
}
    Output.points[5][7] += fd0;
    fb1 = lb0 || lb1;
    lb3 = lb5 || fb0;
    Thought lo6 = Thought3.getInstance(fb1, lb0, lb1, lb3);
    double ld7 = 72.31334600517575;
    lb5 = fb0 && fb1;
    double ld8 = 43.59775021866152;
    Thought lo9 = Thought7.getInstance(ld8, fd0, fd1, ld7);
    lb0 = lb1 || lb3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad2 *= -1;
    fb1 = ad3 > ad4;
    Thought lo0 = Thought6.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
    fb1 = !fb0;
    fb1 = ad2 < ad3;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb2 = true;
    double ld3 = 66.88601262580256;
    double ld4 = 245.5981827925815;
if(ao2 != null){
          ao1 = ao2.m4(lb1, lb2, fb0, fb1);
}
if(ao3 != null){
      lb1 = ao3.m2(ad2, ad3, ad4, fd0);
}
    Thought lo5 = Thought18.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld3, ld4, ad1, fb0, fb1, lb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 722.1330397831036;
    if (ab1) {
        fd0 *= -1;
        fd1 = ld0 + fd0;
        ab2 = !ab3;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
if(ao3 != null){
          ao3.m3();
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        if (fb1) {
if(fo0 != null){
              ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
            if (fb0) {
if(ao1 != null){
                  fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
                  ao2.m3(ao3, ao4, fo0, fo1);
}
                fd1 = ld0 - fd0;
}}}
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
    Thought lo0 = Thought12.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Output.points[5][8] += ad4;
    ab4 = !fb0;
if(ao1 != null){
      ao1.m1();
}
    fb1 = !ab1;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb1 = fd0 < fd1;
if(ao1 != null){
      lb2 = ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought9.getInstance(ao3, ao4, fo0, fo1);
    boolean lb4 = false;
    boolean lb5 = false;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        Thought lo6 = Thought9.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, lb1, lb2, lb4);
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb5, ab1, ab2, ab3);
}
        boolean lb7 = false;
        double ld8 = 585.3043025931544;
        ab3 = ad3 < ad4;
        Output.points[6][0] += fd0;
        Thought lo9 = Thought15.getInstance(ao1, ao2, ao3, ao4, fd1, ld8, ad1, ad2);
        ab4 = ad3 > ad4;
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
        fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    double ld2 = 288.74261704091373;
    Output.points[6][1] += fd0;
    Output.points[6][2] -= fd1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      ld2 = fo1.m3(lb0, lb1, fb0, fb1);
}
    double ld3 = 107.02535574084088;
    Thought lo4 = Thought14.getInstance(ld3, fd0, fd1, ld2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
    Output.points[6][3] -= fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought14.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < fd0;
    boolean lb3 = true;
    fd1 *= -1;
    lb1 = fd0 < fd1;
    Thought lo4 = Thought13.getInstance(lb3, fb0, fb1, lb0);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = lb3 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb3);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
    boolean lb5 = true;
    double ld6 = 786.6210366831954;
if(fo1 != null){
      fo0 = fo1.m4(ld6, fd0, fd1, ld6, fb0, fb1, lb0, lb1);
}
    boolean lb7 = true;
    fd0 = fd1 - ld6;

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
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 *= -1;
    Thought lo1 = Thought1.getInstance();
    boolean lb2 = true;
    lb0 = lb2 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
    Output.points[6][4] -= fd1;
        Thought lo3 = Thought9.getInstance(fb1, lb0, lb2, fb0);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        double ld4 = 251.59870590120954;
    fb1 = lb0 || lb2;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld4 = fd0 + fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, lb2, fb0, fb1, lb0);
}
    boolean lb5 = false;

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
