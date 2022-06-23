package genetic;
import java.util.ArrayList;
class Thought1 extends Thought{
private static ArrayList<Thought1> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 380.6059111293333;
private double fd1 = 160.4496150838834;
private Thought fo0 = null;
private Thought fo1 = null;
Thought1 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought1 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought1 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought1 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought1 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought39.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (fb1) {
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
        fb1 = fb0 && fb1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3();
}
    Output.points[2][0] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;

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
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fd1 *= -1;
    fb1 = lb0 || fb0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought38.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    if (fb0) {
        boolean lb2 = false;
        fd1 = ad1 + ad2;
        double ld3 = 895.7933228636003;
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    ab4 = fd1 > ad1;
    boolean lb2 = true;
    boolean lb3 = true;
    Output.points[2][1] -= ad2;
    boolean lb4 = false;
    boolean lb5 = true;
    Output.points[2][2] += ad3;
    ab1 = ab2 || ab3;
    double ld6 = 539.3291515924423;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld6);
}
if(fo0 != null){
      ad1 = fo0.m3(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb7 = true;
    Thought lo8 = Thought65.getInstance(ad2, ad3, ad4, fd0, lb1, lb2, lb3, lb4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb5 = lb7 && ab1;
    boolean lb9 = true;
    ab1 = ab2 && ab3;
    fd1 = ld6 + ad1;
    boolean lb10 = false;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, lb3, lb4);
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
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          fd1 = ao3.m3(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
        double ld0 = 179.81924640054277;
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought21.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
    double ld3 = 605.8074732519577;
    ld3 *= -1;
    double ld4 = 445.03809711354415;
if(ao2 != null){
      lb1 = ao2.m2(ld4, fd0, fd1, ld0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld3, ld4, fd0, fd1);
}
    fb1 = lb1 && fb0;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      lb1 = ao4.m2();
}
    ld3 *= -1;
    Thought lo5 = Thought95.getInstance(ld4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);

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
    ad2 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 878.3003800268382;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
        Thought lo3 = Thought7.getInstance(ld2, ad1, ad2, ad3);
        double ld4 = 864.2585076457299;
        ad3 *= -1;
        double ld5 = 160.07233311482761;
        ad3 = ad4 - fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    double ld0 = 232.1969567721907;
    fb1 = !ab1;
    ab2 = fd0 > fd1;
    Thought lo1 = Thought71.getInstance(fo0, fo1, ao1, ao2);
    ab3 = ld0 > fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ld0 = fd0 - fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought79.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ad1;
    Thought lo1 = Thought6.getInstance();
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    fd1 *= -1;
    ad1 *= -1;
    ab1 = ad2 > ad3;
    ab2 = ab3 || ab4;
    fb0 = ad4 > fd0;
    Output.points[2][3] -= fd1;
    fb1 = ab1 || ab2;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
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
    boolean lb0 = false;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    Output.points[2][4] -= fd1;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, fb0, fb1);
}
        lb0 = !lb1;
    fd0 *= -1;
    double ld3 = 639.4550324819679;
    fd0 = fd1 + ld3;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[2][5] -= fd1;
    double ld0 = 334.0271512283708;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        double ld1 = 252.6899491541989;
    double ld2 = 591.2988231335604;
if(fo0 != null){
          ld0 = fo0.m3(ld1, ld2, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, ld2, fd0);
}
    fd1 = ld0 - ld1;
    double ld3 = 413.96462829153626;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 542.0178141628163;
    fb1 = !fb0;
    if (fb1) {
        fd0 = fd1 + ld0;
        boolean lb1 = true;
        } else if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1(fd1, ld0, ad1, ad2);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        boolean lb2 = false;
        fb0 = fb1 || lb2;
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          fo1.m3(ld0, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
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
    double ld0 = 314.02249377502324;
        boolean lb1 = false;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought61.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
    Thought lo3 = Thought19.getInstance(ad4, fd0, fd1, ld0);
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld4 = 765.125137013084;
if(fo1 != null){
      fo1.m1(fb1, lb1, ab1, ab2);
}
    ad4 = fd0 - fd1;
    ab3 = ab4 && fb0;
    fb1 = ld0 < ld4;
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 || ab4;

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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 907.0165267329261;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought74.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    ld0 = fd0 - fd1;
    Thought lo2 = Thought42.getInstance(ld0, fd0, fd1, ld0);
    boolean lb3 = false;
    fd0 *= -1;
    Thought lo4 = Thought31.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
        ld0 *= -1;
    Thought lo5 = Thought18.getInstance(lb3, fb0, fb1, lb3);
    Output.points[2][6] -= fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    Thought lo6 = Thought22.getInstance();
    fb0 = fd1 < ld0;
    Thought lo7 = Thought68.getInstance(fd0, fd1, ld0, fd0, fb1, lb3, fb0, fb1);
    boolean lb8 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought9.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought66.getInstance(ad2, ad3, ad4, fd0);
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought46.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
        fb1 = ad4 > fd0;
        Thought lo3 = Thought97.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
          fd1 = ao3.m3();
}
        ad1 *= -1;
        ad2 = ad3 - ad4;
        }
    Output.points[2][7] -= fd0;
if(ao4 != null){
      fb0 = ao4.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        ad4 = fd0 + fd1;
    Thought lo4 = Thought9.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab3 = fd0 > fd1;
    Output.points[2][8] += fd0;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    lb1 = lb2 && ab1;
    boolean lb3 = false;
    Output.points[3][0] += fd1;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    lb1 = !lb2;

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
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    ab4 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    boolean lb0 = true;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fd0 = ao1.m3(fb0, fb1, lb0, lb1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m1(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought70.getInstance(fo0, fo1, ao1, ao2);
        }
    ad4 = fd0 - fd1;
    fb0 = fb1 && lb0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 334.7273721366086;
    fb1 = fb0 || fb1;
    fb0 = ld0 < fd0;
    Output.points[3][1] += fd1;
    ld0 = fd0 + fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    boolean lb2 = false;

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
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(lb0, lb1, lb2, ab1);
}
    Thought lo3 = Thought27.getInstance();
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    double ld4 = 644.1381343428118;
    boolean lb5 = false;
    for(int i0=0; i0<10; i0++){
        double ld6 = 653.3389783373966;
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    double ld0 = 788.1873211531823;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > ad1;

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
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    ab4 = fd1 < ad1;
    double ld0 = 840.0652792877892;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2();
}
    ad2 *= -1;

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
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
    Thought lo1 = Thought22.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = false;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = lb0 || lb2;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    double ld3 = 804.3012030350985;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
    if (fb0) {
        fd1 = ld3 + fd0;
        fb1 = fd1 < ld3;
        lb0 = !lb2;
        for(int i0=0; i0<10; i0++){
            fd0 *= -1;
            boolean lb4 = true;
            fd1 = ld3 + fd0;
            Output.points[3][2] -= fd1;
if(ao1 != null){
              ld3 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
}
            lb2 = !fb0;
if(fo1 != null){
              fo1.m1(fb1, lb4, lb0, lb2);
}
if(ao1 != null){
              ao1.m2();
}
if(ao2 != null){
              fb0 = ao2.m2(fd1, ld3, fd0, fd1, fb1, lb4, lb0, lb2);
}
            fb0 = ld3 > fd0;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 *= -1;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && lb0;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    double ld3 = 985.1379344548415;

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
    if (ab2) {
        fd0 = fd1 - fd0;
        if (ab3) {
            fd1 = fd0 - fd1;
            ab4 = fd0 < fd1;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
              ao1.m1(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
            ab1 = !ab2;
            Thought lo0 = Thought40.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
            fd0 *= -1;
            ab3 = !ab4;
if(ao1 != null){
              fo1 = ao1.m4(fb0, fb1, ab1, ab2);
}
if(ao2 != null){
              fd1 = ao2.m3();
}
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
}}
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
    Thought lo2 = Thought19.getInstance(lb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = lb0 || lb1;

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
    fb0 = !fb1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought16.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = fd0 < fd1;
    boolean lb2 = true;
    double ld3 = 736.5357072430247;
    lb0 = ld3 < fd0;
    Output.points[3][3] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    ld3 = fd0 + fd1;
    lb2 = fb0 && fb1;
    boolean lb4 = false;
    ld3 = fd0 - fd1;
    lb0 = ld3 < fd0;
    double ld5 = 901.2046221465622;
    fd0 = fd1 - ld3;
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld3);
}
    boolean lb6 = true;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[3][4] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
        } else {
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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    double ld1 = 44.74252224663425;
    lb0 = fb0 && fb1;
    Output.points[3][5] -= ad2;
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
        if (lb0) {
if(fo1 != null){
              fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              fo0.m1(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            lb0 = !fb0;
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
              ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
            double ld2 = 427.16841686176303;
            for(int i1=0; i1<10; i1++){
                fb1 = ad4 > fd0;
if(fo1 != null){
                  lb0 = fo1.m2(fd1, ld2, ld1, ad1);
}
if(fo0 != null){
                  fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
                fd1 = ld2 + ld1;
                Thought lo3 = Thought99.getInstance(fb1, lb0, fb0, fb1);
if(fo0 != null){
                  fo1 = fo0.m4();
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 *= -1;
    ab1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = ab1 && ab2;
    ad4 *= -1;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    Thought lo0 = Thought63.getInstance(ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb1 = false;
    Output.points[3][6] += fd0;
    Output.points[3][7] -= fd1;
        Thought lo2 = Thought82.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);

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
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought91.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 = ad2 - ad3;
    Thought lo0 = Thought25.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[3][8] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Thought lo1 = Thought95.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);

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
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4();
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    ab3 = fd1 < fd0;
    double ld2 = 449.51489409122445;
    ab4 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        boolean lb3 = true;
        fd0 *= -1;
        fd1 = ld2 + fd0;
        fb0 = fd1 > ld2;
        for(int i1=0; i1<10; i1++){
            fd0 *= -1;
if(ao4 != null){
              fb1 = ao4.m2(fd1, ld2, fd0, fd1);
}
            ld2 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ad4 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought14.getInstance(ab3, ab4, fb0, fb1);
    boolean lb1 = true;
    Thought lo2 = Thought33.getInstance();
    Thought lo3 = Thought39.getInstance(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    double ld4 = 886.2965040059282;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    lb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    boolean lb5 = true;
    lb1 = lb5 && ab1;
    ab2 = !ab3;
    Thought lo6 = Thought12.getInstance(fd1, ld4, ad1, ad2);
    ad3 = ad4 + fd0;

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
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fd0 > fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[4][0] += fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
        lb0 = fd0 > fd1;
    Thought lo1 = Thought11.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
        fd1 *= -1;
    Thought lo2 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3();
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
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    double ld1 = 551.4655777134908;
    lb0 = fd0 > fd1;
    boolean lb2 = false;
    lb2 = ld1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
}
        fb1 = lb0 && lb2;
    fb0 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
    boolean lb3 = true;
    fd1 *= -1;
    ld1 *= -1;
    fd0 = fd1 - ld1;
    fb0 = fd0 > fd1;
    fb1 = ld1 > fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    lb3 = fd0 < fd1;
    boolean lb4 = true;
    ld1 = fd0 - fd1;
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
}
