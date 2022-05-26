package genetic;
import java.util.ArrayList;
class Thought0 extends Thought{
private static ArrayList<Thought0> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 51.065316445748074;
private double fd1 = 539.2262844737628;
private Thought fo0 = null;
private Thought fo1 = null;
Thought0 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought0 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought0 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought0 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought0 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought18.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    Thought lo3 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
    lb1 = !lb2;
    Thought lo4 = Thought19.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
    double ld5 = 582.3981412273597;
    fb0 = fb1 && lb1;
    fd0 = fd1 - ld5;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb6 = false;
    fd1 = ld5 - fd0;
    lb2 = lb6 || fb0;
    fd1 = ld5 + fd0;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
        fd1 = fd0 + fd1;
    ab4 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    Thought lo2 = Thought8.getInstance(fo0, fo1, fo0, fo1);
        Thought lo3 = Thought6.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
    fd1 = fd0 - fd1;
    double ld4 = 897.5368594031639;
    boolean lb5 = false;
if(fo0 != null){
      ld4 = fo0.m3(fd0, fd1, ld4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld4 - fd0;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 24.69876769796993;
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
    fd1 = ld0 + ad1;
    Thought lo1 = Thought5.getInstance();
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = ad1 < ad2;
    Thought lo2 = Thought8.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    Thought lo3 = Thought17.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = true;
    ad1 = ad2 - ad3;

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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 850.9519184409663;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad4 *= -1;
    lb0 = lb1 || ab1;
    Thought lo3 = Thought8.getInstance(ab2, ab3, ab4, fb0);
    double ld4 = 348.4086025291875;

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
    double ld0 = 236.12482366643962;
    fb1 = !fb0;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, lb1, lb2, fb0, fb1);
}
    ld0 *= -1;
    lb1 = lb2 && fb0;
    double ld3 = 280.76247566848144;

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
    fb1 = ad2 > ad3;
    boolean lb0 = false;
    lb0 = ad4 < fd0;
if(ao2 != null){
      ao2.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    Output.points[0][0] -= fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = lb0 && lb1;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, lb0, ab1);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    Thought lo2 = Thought2.getInstance(fd0, fd1, fd0, fd1);
    lb1 = ab1 || ab2;
    boolean lb3 = false;
    Output.points[0][1] -= fd0;
    ab2 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 && fb0;

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
    ab1 = !ab2;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
        Output.points[0][2] -= ad2;
        ab1 = ad3 > ad4;
        Thought lo1 = Thought16.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
        fd0 *= -1;
        Thought lo2 = Thought4.getInstance(fb1, lb0, ab1, ab2);
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
        Output.points[0][3] -= fd0;
        double ld3 = 663.9629923264121;
        boolean lb4 = false;
        fd0 = fd1 - ld3;
        ad1 = ad2 - ad3;
        Thought lo5 = Thought13.getInstance(fo1, ao1, ao2, ao3);
        Output.points[0][4] += ad4;
        double ld6 = 510.00776388376954;
        Thought lo7 = Thought19.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
if(ao2 != null){
          ao2.m2(ld6, ad1, ad2, ad3, fb1, lb4, lb0, ab1);
}
        ab2 = ad4 < fd0;
        ab3 = ab4 || fb0;
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
    Thought lo0 = Thought10.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[0][5] -= fd1;
    fd0 *= -1;
    double ld1 = 403.1264837136694;
    fd0 = fd1 + ld1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][6] += ld1;
    double ld2 = 388.37007571150014;
    fb0 = !fb1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    double ld3 = 750.4202119495269;
    fb1 = ld1 < ld2;
if(fo1 != null){
      fo1.m3(ld3, fd0, fd1, ld1);
}
    fb0 = !fb1;
    boolean lb4 = true;
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    ld2 *= -1;

Thought.STACK_COUNTER++;
return lb4;
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
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab4 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    double ld1 = 414.61834817517905;
    Output.points[0][7] -= ld1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fb0 = fd1 < ld1;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo2 = Thought1.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
        ab1 = !ab2;
        ab3 = fd1 > ld1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb1 = fb0 || fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Output.points[0][8] += ad2;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
    double ld0 = 370.46546764979337;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
    lb1 = lb2 && ab1;
    double ld3 = 26.86362674182876;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought12.getInstance(ad1, ad2, ad3, ad4, fb1, lb1, lb2, ab1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
    double ld5 = 371.27643646773527;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb6 = false;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ld5 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb6, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    Output.points[1][0] += fd1;
    ld0 = ld3 - ld5;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought7.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought6.getInstance();
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought6.getInstance(lb2, fb0, fb1, lb2);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb4 = false;
    Thought lo5 = Thought10.getInstance(ao2, ao3, ao4, fo0);
    boolean lb6 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb4, lb6, fb0, fb1);
}
    double ld7 = 783.9701692908898;
    Thought lo8 = Thought0.getInstance(fd0, fd1, ld7, fd0, lb2, lb4, lb6, fb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    fb0 = !fb1;
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    Thought lo1 = Thought11.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    boolean lb2 = true;
    double ld3 = 104.97317942669206;
    ld3 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3);
}
    lb1 = lb2 && ab1;
    fd0 = fd1 - ld3;
    ab2 = fd0 > fd1;
    ab3 = ld3 < fd0;
    ab4 = fd1 < ld3;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb1 = ab1 || ab2;
    double ld0 = 264.61240510701185;
    ad2 = ad3 - ad4;
    ab3 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    ld0 *= -1;
    double ld2 = 192.1298787970696;
if(ao4 != null){
      ao3 = ao4.m4(ld2, ad1, ad2, ad3);
}
    if (ab1) {
        ad4 = fd0 + fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[1][1] -= fd1;
    double ld0 = 53.5327607806792;
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
    lb1 = lb2 && lb3;
    Output.points[1][2] -= ld0;
    Output.points[1][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
}
    lb3 = fb0 && fb1;
    ld0 = fd0 - fd1;
    lb1 = !lb2;
    lb3 = fb0 && fb1;
    lb1 = !lb2;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[1][4] += fd1;
    double ld0 = 369.4002077659323;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
if(fo0 != null){
          fd0 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought15.getInstance(fd1, ld0, fd0, fd1);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 && ab1;
        ab2 = ab3 && ab4;
        }
    fb0 = fb1 && ab1;
    Output.points[1][5] += ld0;
    fd0 *= -1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);

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
if(fo0 != null){
      fo1 = fo0.m4();
}
        fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 < ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought11.getInstance();
    boolean lb2 = true;
    double ld3 = 819.6817705046134;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, ad1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        ab1 = ab2 && ab3;
        Output.points[1][6] -= ad2;
        ab4 = fb0 && fb1;
        Thought lo1 = Thought15.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        boolean lb2 = true;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
        boolean lb3 = true;
        ad3 = ad4 + fd0;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(lb2, lb3, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        ab3 = !ab4;
        fd0 = fd1 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 - ad1;
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
    fb1 = !fb0;
    Thought lo0 = Thought9.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought17.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    double ld2 = 275.4336796455348;
    fb1 = fd0 < fd1;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb3 = fb0 || fb1;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fb1 = ld2 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(lb3, fb0, fb1, lb3);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ld2;
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought11.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > ad1;
    ad2 *= -1;
if(ao4 != null){
      ao4.m1(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 541.0530168129048;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
}
    Thought lo2 = Thought19.getInstance();
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    double ld3 = 446.39561044041125;
    fb1 = !fb0;
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb4, fb0);
}
    double ld5 = 746.7768567238105;
    fb1 = !lb4;
    fb0 = !fb1;
    Thought lo6 = Thought1.getInstance(ad2, ad3, ad4, fd0);
    lb4 = !fb0;
        fb1 = lb4 && fb0;
    Thought lo7 = Thought6.getInstance(fo1, ao1, ao2, ao3);
    fb1 = !lb4;
    Thought lo8 = Thought8.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, ld3, ld5, fb0, fb1, lb4, fb0);
    Thought lo9 = Thought12.getInstance(ad1, ad2, ad3, ad4, fb1, lb4, fb0, fb1);
    Output.points[1][7] += fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 675.3022192981778;
    ld0 = fd0 - fd1;
    ab1 = ab2 || ab3;
    boolean lb1 = true;
if(ao1 != null){
      ld0 = ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb1 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0);
}
    ab4 = fb0 && fb1;
    fd1 = ld0 + fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
}
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
    lb1 = lb2 && lb3;
    ld0 *= -1;
    lb4 = fd0 < fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab1 = !ab2;
    ab3 = ad3 > ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[1][8] += fd1;
    fb1 = ab1 || ab2;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb1, ab1, ab2);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
        boolean lb0 = false;
    fd0 *= -1;
    Thought lo1 = Thought14.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[2][0] += fd0;
    lb0 = !fb0;

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
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 < fd0;
        boolean lb0 = true;
        ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        Thought lo1 = Thought18.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        double ld2 = 836.8213645051899;
if(fo1 != null){
          fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - ld2;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
        double ld3 = 486.7357460518312;
        ld3 *= -1;
        ab2 = !ab3;
        ab4 = fd0 < fd1;
        fb0 = !fb1;
if(fo0 != null){
          fo0.m3(ld2, ld3, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld4 = 732.9563887611642;
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
    double ld0 = 113.29122440257142;
    double ld1 = 510.9500459459683;
    ld0 *= -1;
    ld1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought9.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ld0 - ld1;
        fb0 = fb1 && fb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = !fb1;
    ld0 *= -1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought16.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
          ld1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb5 = false;
    fb0 = fd0 > fd1;
        boolean lb6 = false;
    ld0 = ld1 - ad1;
    Thought lo7 = Thought10.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb5, lb6, fb0);
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
    ad2 *= -1;
    ab2 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought0.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
    ab1 = ab2 || ab3;
    double ld1 = 391.18324839472365;
    ad3 = ad4 - fd0;
    ab4 = fb0 || fb1;
    double ld2 = 859.7050429000494;

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
    fb0 = fb1 || fb0;
    Output.points[2][1] -= fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2();
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        double ld0 = 791.5725187120621;
        fb1 = fd0 > fd1;
if(ao3 != null){
          ld0 = ao3.m3(fb0, fb1, fb0, fb1);
}
        if (fb0) {
            boolean lb1 = false;
            Output.points[2][2] -= fd0;
            fd1 = ld0 - fd0;
            double ld2 = 949.2463907848844;
            fd0 *= -1;
if(fo0 != null){
              ao4 = fo0.m4(fd1, ld2, ld0, fd0);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
            fd1 = ld2 - ld0;
if(fo1 != null){
              fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld2, ld0, fd0, fb0, fb1, lb1, fb0);
}
            Thought lo3 = Thought8.getInstance(fd1, ld2, ld0, fd0, fb1, lb1, fb0, fb1);
            lb1 = fd1 > ld2;
}}
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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m2();
}
    boolean lb1 = false;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m1(lb1, fb0, fb1, lb0);
}
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    double ld2 = 611.4025979077278;
    lb1 = !fb0;
    fb1 = !lb0;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    fd1 = ld2 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > ld2;
    boolean lb3 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld4 = 566.955010786628;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
    double ld1 = 316.32769484195825;
    lb0 = ab1 || ab2;
if(ao1 != null){
      ao1.m1();
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = ld1 > fd0;
    fb0 = fb1 && lb0;
    ab1 = fd1 < ld1;
    fd0 = fd1 - ld1;
    ab2 = fd0 > fd1;
    boolean lb2 = false;
    ab2 = ld1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
    double ld3 = 932.426690205322;
    lb0 = !lb2;
    ld1 = ld3 + fd0;
    fd1 = ld1 + ld3;
    Thought lo4 = Thought8.getInstance(fd0, fd1, ld1, ld3);
    boolean lb5 = true;
    fd0 = fd1 - ld1;
    boolean lb6 = false;
if(ao3 != null){
      lb5 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld7 = 354.79648252970134;
    ld3 *= -1;
    Thought lo8 = Thought7.getInstance(ao2, ao3, ao4, fo0, ld7, fd0, fd1, ld1, lb6, ab1, ab2, ab3);
    Output.points[2][3] += ld3;
if(ao1 != null){
      fo1 = ao1.m4(ld7, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[2][4] -= fd1;
    ab3 = ad1 < ad2;
    boolean lb0 = true;
    Thought lo1 = Thought14.getInstance();
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        double ld2 = 542.4143423351396;
        ad3 = ad4 - fd0;
        fd1 = ld2 - ad1;
        ad2 *= -1;
if(fo0 != null){
          lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
        Output.points[2][5] -= ad3;
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ld2);
}
        fb0 = fb1 || lb0;
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        ad1 = ad2 - ad3;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2, fb1, lb0, ab1, ab2);
}
        ad1 = ad2 - ad3;
if(ao1 != null){
          ao1.m2(ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 && ab2;
        ad1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4();
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
        fb1 = !fb0;
    Thought lo0 = Thought16.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought8.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    boolean lb2 = true;
    Thought lo3 = Thought10.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = true;
    double ld5 = 508.23036936167836;
    lb4 = !fb0;
        fb1 = lb2 && lb4;

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
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought14.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought6.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[2][6] -= fd1;
    Thought lo2 = Thought17.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    Output.points[2][7] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
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
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Thought lo0 = Thought14.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    lb2 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2();
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
