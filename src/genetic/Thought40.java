package genetic;
import java.util.ArrayList;
class Thought40 extends Thought{
private static ArrayList<Thought40> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 164.48329560521455;
private double fd1 = 489.5107239913189;
private Thought fo0 = null;
private Thought fo1 = null;
Thought40 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought40 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought40 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought40 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought40 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought45.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought13.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    Output.points[7][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
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
    fd0 *= -1;
    fd1 *= -1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    Output.points[7][4] -= fd0;
    Output.points[7][5] -= fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
        ab2 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought24.getInstance(fb1, lb0, ab1, ab2);
    fd0 = fd1 - fd0;
if(fo1 != null){
      ab3 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 < fd0;
    Output.points[7][6] -= fd1;
    Thought lo2 = Thought47.getInstance(fo1, fo0, fo1, fo0);

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
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    fb1 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    fb1 = !lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab1 = ad3 < ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2();
}
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought58.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        ab3 = !ab4;
        double ld1 = 602.0137095523822;
        fb0 = ad1 > ad2;
        Output.points[7][7] -= ad3;
        ad4 *= -1;
        Thought lo2 = Thought1.getInstance(fd0, fd1, ld1, ad1, fb1, ab1, ab2, ab3);
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
    double ld0 = 556.6456612807821;
    fb1 = ld0 > fd0;
    Thought lo1 = Thought73.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought19.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    ld0 = fd0 - fd1;
    double ld3 = 130.93616277808934;
    fb0 = ld0 < ld3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, ld0, ld3);
}
    double ld4 = 64.45537624175073;
    fb0 = ld4 < fd0;
    fb1 = fb0 || fb1;

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
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
    double ld0 = 116.10370496072181;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    boolean lb2 = false;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought12.getInstance();
    double ld4 = 934.5976987092978;
    ld4 = ad1 - ad2;
    ad3 *= -1;
    lb1 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld4, ad1, lb2, fb0, fb1, lb1);
}
    ad2 = ad3 - ad4;
    Thought lo5 = Thought99.getInstance(ao4, fo0, fo1, ao1);
    lb2 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld4, lb1, lb2, fb0, fb1);
}
    ad1 = ad2 + ad3;

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
    fd1 = fd0 - fd1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb0 = true;
if(ao3 != null){
      fd0 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    double ld1 = 36.19010130951054;

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
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought95.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
    fd1 = ad1 + ad2;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1);
}
    double ld2 = 162.79491508664296;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = ld2 > ad1;
    fb1 = lb0 || ab1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Thought lo3 = Thought23.getInstance(ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    lb0 = ab1 || ab2;
    if (ab3) {
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
    Thought lo0 = Thought53.getInstance(fo0, fo1, fo0, fo1);
    if (fb0) {
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fb1 = !fb0;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb0 = false;
    Thought lo1 = Thought76.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
        fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][8] -= fd0;
    Thought lo2 = Thought55.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    boolean lb3 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[8][0] += fd0;
    Thought lo4 = Thought94.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, lb0, lb3);
}

Thought.STACK_COUNTER++;
return ab1;
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
    Output.points[8][1] -= ad2;
    ad3 *= -1;
if(fo1 != null){
      fo1.m2();
}
    Thought lo0 = Thought87.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought5.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
        double ld2 = 509.1022999939414;
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fd0 = fd1 - ld2;
        ad1 *= -1;
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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Thought lo0 = Thought75.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    double ld2 = 677.6055534852655;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[8][2] += ad1;
    boolean lb3 = false;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, lb1, lb3, ab1);
}
    ab2 = fd1 < ld2;
    ab3 = ad1 > ad2;
    ab4 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought95.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 370.8692246093195;
    ld1 = fd0 + fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = !fb0;
    Output.points[8][4] += ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(ao4 != null){
      lb0 = ao4.m2(ad1, ad2, ad3, ad4);
}
    Output.points[8][5] += fd0;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    lb1 = !lb2;
    fd0 = fd1 + ad1;
    fb0 = fb1 && lb0;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(lb1, lb2, lb3, fb0);
}
    fb1 = lb0 && lb1;
if(fo1 != null){
      lb2 = fo1.m2();
}
    ad2 = ad3 - ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        Thought lo0 = Thought17.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
        double ld1 = 22.81948367899777;
        Thought lo2 = Thought41.getInstance(ao1, ao2, ao3, ao4);
        fb1 = ab1 && ab2;
        double ld3 = 1000.5906079250534;
        boolean lb4 = true;
        ab2 = ld1 < ld3;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb4, ab1, ab2, ab3);
}
        ab4 = !fb0;
        fd1 = ld1 + ld3;
}
Thought.STACK_COUNTER++;
return ab1;
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
    boolean lb0 = false;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    double ld1 = 105.65980872789623;
    ab1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3);
}
    double ld2 = 360.4521790597925;
    boolean lb3 = false;
    Thought lo4 = Thought46.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(ao4 != null){
      ao4.m1();
}
    double ld5 = 433.2543575122882;
    lb0 = lb3 || ab1;
    Output.points[8][6] += ad2;
    ad3 = ad4 + fd0;
    Thought lo6 = Thought80.getInstance(fd1, ld1, ld2, ld5, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld7 = 362.8764916579771;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld7, ad1, ad2, ad3, fb1, lb0, lb3, ab1);
}
    boolean lb8 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
          ao4.m2(ld1, ld2, ld5, ld7);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && fb0;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought52.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    double ld2 = 485.9776771611079;
    fb0 = ld2 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > ld2;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[8][7] += ld2;
    fd0 *= -1;
    Thought lo3 = Thought88.getInstance(fd1, ld2, fd0, fd1);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      ld2 = fo0.m3(fb0, fb1, lb0, fb0);
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
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought8.getInstance();
    ab4 = fd1 < fd0;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = fd1 > fd0;
    fb1 = lb1 || ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    fd1 *= -1;
    lb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
    boolean lb2 = true;
    lb1 = lb2 && ab1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, lb2, ab1);
}
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
            }
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought30.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    if (fb1) {
        boolean lb1 = true;
        lb1 = fb0 && fb1;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb2 = true;
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
}
        double ld3 = 245.61984072562458;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb2 = ad4 < fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2, fb1, lb1, lb2, fb0);
}
        ad3 = ad4 + fd0;
        boolean lb4 = false;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb2, lb4);
}
        Thought lo5 = Thought61.getInstance(fd1, ld3, ad1, ad2);
        ad3 = ad4 - fd0;
        fb0 = fb1 && lb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2);
}
        lb2 = lb4 || fb0;
        ad3 = ad4 - fd0;
        fd1 = ld3 - ad1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
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
    fb0 = fb1 || fb0;
    if (fb1) {
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        fd1 *= -1;
        } else {
        Thought lo0 = Thought1.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
          ao2.m3();
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 102.86745787245844;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m3(lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao2.m3();
}
    lb1 = !lb2;
    if (fb0) {
        boolean lb3 = true;
        boolean lb4 = true;
if(ao3 != null){
          lb2 = ao3.m2(ad4, fd0, fd1, ld0, fb0, fb1, lb3, lb4);
}
        lb1 = lb2 && fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    boolean lb1 = true;
    boolean lb2 = true;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    Output.points[8][8] += fd1;
    boolean lb0 = false;
    Output.points[0][0] += ad1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 > ad3;
        ad4 = fd0 - fd1;
        fb1 = ad1 > ad2;
        lb0 = !ab1;
        ad3 = ad4 + fd0;
        fd1 = ad1 - ad2;
        double ld1 = 489.28427609079847;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ao2.m1(ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
if(ao3 != null){
          ao3.m3();
}
        ld1 *= -1;
        if (fb1) {
if(ao4 != null){
              lb0 = ao4.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
            fd0 = fd1 - ld1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][1] -= fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 *= -1;
    double ld1 = 367.96400986552214;
    boolean lb2 = false;
    double ld3 = 513.7647811874572;
    lb2 = ld1 < ld3;

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
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab3 = !ab4;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, ab1, ab2, ab3);
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
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    double ld1 = 383.1605656820244;
    double ld2 = 737.8644205341014;
    Thought lo3 = Thought23.getInstance(ld2, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ld1 - ld2;
    fb0 = !fb1;
    lb0 = !fb0;
    Thought lo4 = Thought57.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m1(ld1, ld2, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    Thought lo5 = Thought79.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb6 = false;
    ld1 = ld2 + ad1;
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb6, lb7, fb0, fb1);
}
    Thought lo8 = Thought18.getInstance(ad2, ad3, ad4, fd0);

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
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought55.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo0.m3(ab1, ab2, ab3, ab4);
}
        fd1 = ad1 - ad2;
        Thought lo1 = Thought41.getInstance();
        fb0 = !fb1;
        Output.points[0][2] += ad3;
        boolean lb2 = true;
        lb2 = ad4 > fd0;
        Thought lo3 = Thought78.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
        double ld4 = 423.9595553811394;
        fb0 = fb1 && lb2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
        Thought lo5 = Thought8.getInstance(ad1, ad2, ad3, ad4);
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
    Output.points[0][3] -= fd1;
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    lb1 = !fb0;
    double ld2 = 648.4353823817796;
if(ao2 != null){
      ao2.m1(fb1, lb0, lb1, fb0);
}
if(ao3 != null){
      ao3.m2();
}
    Thought lo3 = Thought92.getInstance(ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
    Thought lo4 = Thought38.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 || lb1;
    fd1 = ld2 - fd0;

Thought.STACK_COUNTER++;
return ao2;
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
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    Output.points[0][4] -= ad1;
    ad2 *= -1;
    fb1 = fb0 && fb1;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;

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
    ab2 = !ab3;
    if (ab4) {
        fb0 = fd1 < fd0;
        Thought lo0 = Thought29.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        fd1 = fd0 + fd1;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
        ab4 = fd1 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = fd1 < fd0;
        ab4 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m1(fd1, fd0, fd1, fd0);
}
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        boolean lb1 = false;
if(fo1 != null){
          lb0 = fo1.m2(lb1, ab1, ab2, ab3);
}
        ad3 = ad4 + fd0;
if(ao1 != null){
          fd1 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
        double ld2 = 977.1960388854976;
        boolean lb3 = false;
        ad4 = fd0 - fd1;
if(ao4 != null){
          lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        lb3 = ld2 > ad1;
        ad2 = ad3 + ad4;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, ab1, ab2, ab3, ab4);
}
        Thought lo4 = Thought0.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
        lb3 = ad2 < ad3;
        for(int i1=0; i1<10; i1++){
            boolean lb5 = false;
            Thought lo6 = Thought69.getInstance(ad4, fd0, fd1, ld2);
}}
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
    fb1 = fb0 && fb1;
    Output.points[0][5] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb1 = true;
    lb1 = fd0 > fd1;
    fb0 = !fb1;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    double ld2 = 917.1700035155619;
    double ld3 = 160.98567840221105;
    fb1 = !lb0;
    Thought lo4 = Thought42.getInstance(fo0, fo1, fo0, fo1);
    lb1 = ld2 > ld3;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fb1 && lb0;
        boolean lb5 = true;
    Output.points[0][6] += ld2;
    lb1 = !lb5;
    ld3 = fd0 + fd1;
        ld2 = ld3 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, fb0, fb1, lb0, lb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought59.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    Output.points[0][7] -= fd0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    Thought lo1 = Thought91.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    double ld2 = 662.5537480389568;
    fd0 = fd1 + ld2;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    double ld3 = 219.24241568101397;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    Thought lo0 = Thought12.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[0][8] -= fd1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    Thought lo1 = Thought11.getInstance(fo1, fo0, fo1, fo0);

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
