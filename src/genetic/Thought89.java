package genetic;
import java.util.ArrayList;
class Thought89 extends Thought{
private static ArrayList<Thought89> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 110.80446131338043;
private double fd1 = 245.89627434764668;
private Thought fo0 = null;
private Thought fo1 = null;
Thought89 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought89 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought89 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought89 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought89 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[6][2] += fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo0 = Thought241.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    Output.points[6][3] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    lb1 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    Thought lo1 = Thought340.getInstance();
    ab3 = ab4 && fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[6][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    Thought lo3 = Thought26.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, lb2, ab1, ab2);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab3 = !ab4;
    double ld4 = 285.92678545452225;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld4;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, fb1, lb0, lb2, lb5);
}
    ab1 = !ab2;

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
    Thought lo0 = Thought322.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    ad3 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb1);
}
    Output.points[6][5] += ad1;
    ad2 = ad3 + ad4;
    lb2 = fd0 > fd1;
    Output.points[6][6] += ad1;
    lb3 = !fb0;
    ad2 *= -1;
    Output.points[6][7] -= ad3;
    ad4 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
        fb1 = fd1 > ad1;

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
    Output.points[6][8] += ad2;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    ab3 = fd0 < fd1;
    Thought lo1 = Thought382.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
    double ld2 = 318.8358450397535;

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
    Thought lo0 = Thought157.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][0] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought249.getInstance(ao2, ao3, ao4, fo0);
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    double ld3 = 782.0256422074508;

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
    fb1 = fb0 || fb1;
        fb0 = ad4 > fd0;
    double ld0 = 545.1802661895565;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2();
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    double ld1 = 473.3173720362247;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
}
    Thought lo2 = Thought120.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);

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
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought331.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
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
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fb1 = ab1 && ab2;
        boolean lb0 = false;
        double ld1 = 818.9925517543878;
        ab2 = ld1 < ad1;
        Output.points[7][1] -= ad2;
if(ao3 != null){
          ad3 = ao3.m3(ad4, fd0, fd1, ld1);
}
        }
    boolean lb2 = false;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 896.2407451191633;
    Thought lo1 = Thought174.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld0;
    double ld2 = 798.8482847664976;
    fb0 = ld2 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ld0, ld2, fd0);
}
    fd1 = ld0 + ld2;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 948.6152092654804;
    ab2 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ab3 = fo1.m2(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    boolean lb2 = true;
    boolean lb3 = false;
        lb1 = ld0 < fd0;
    lb2 = lb3 || ab1;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, lb4, ab1);
}
    ab2 = ab3 && ab4;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;

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
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    double ld0 = 445.2628540223952;
    ld0 *= -1;
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[7][2] -= ld0;
    Output.points[7][3] += ad1;
    ad2 *= -1;
    double ld1 = 816.8229459735035;
    ad2 *= -1;
    ad3 *= -1;
    Thought lo2 = Thought145.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = ld1 < ad1;
    boolean lb3 = true;
    ad2 = ad3 - ad4;
    lb3 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
}
    lb3 = ld0 < ld1;
    fb0 = !fb1;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb3);
}
    fb0 = !fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    Thought lo0 = Thought380.getInstance();
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    Thought lo2 = Thought398.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1, fb1, lb1, ab1, ab2);
}
    Output.points[7][4] += ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    Output.points[7][5] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    fd0 = fd1 + fd0;
    fb1 = !lb0;
    double ld1 = 463.4959473302373;
    fd0 = fd1 - ld1;
    fd0 *= -1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    ld1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb0, lb2);
}
    fb0 = fd1 < ld1;

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
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought397.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    ad4 *= -1;
    Thought lo2 = Thought87.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    boolean lb3 = false;

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
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb1 = lb0 && ab1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      ab1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 968.5376543066918;
        boolean lb3 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
if(ao2 != null){
          ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
          ao3.m2(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
        ab4 = ad2 > ad3;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
        ab2 = !ab3;
if(ao3 != null){
          fd0 = ao3.m3();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        fb0 = fd1 < fd0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
        double ld0 = 644.5942124739041;
        fb1 = !fb0;
        boolean lb1 = false;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
        fb0 = ld0 < fd0;
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
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    lb0 = !ab1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[7][6] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought25.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][7] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 649.5276228618015;
    double ld1 = 994.3365845605471;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    Thought lo3 = Thought109.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      lb2 = fo1.m2(ad4, fd0, fd1, ld0);
}
    ld1 = ad1 - ad2;
        fb0 = fb1 || lb2;
    Thought lo4 = Thought53.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      ld0 = fo0.m3(ld1, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;
    boolean lb5 = false;
    boolean lb6 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
    double ld7 = 789.7635198400482;
    boolean lb8 = true;
    lb2 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld7, ad1, ad2, lb5, lb6, lb8, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fb1, lb2, lb5, lb6);
}
    lb8 = fb0 && fb1;
    lb2 = !lb5;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        ab2 = ad2 < ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo0 = Thought120.getInstance(ad1, ad2, ad3, ad4);
        ab3 = ab4 || fb0;
        boolean lb1 = true;
        fd0 = fd1 - ad1;
        boolean lb2 = true;
        ad2 = ad3 + ad4;
        boolean lb3 = false;
        double ld4 = 423.05548032775846;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
}
        boolean lb5 = false;
if(fo1 != null){
          ab2 = fo1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
        fd1 = ld4 + ad1;
        Output.points[7][8] += ad2;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, lb5, ab1);
}
        Output.points[8][0] -= ad3;
if(fo1 != null){
          ad4 = fo1.m3();
}
        ab2 = fd0 > fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 521.8755160230204;
    double ld1 = 16.30393730804208;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, ld0, ld1, fd0);
}
    fb1 = fb0 || fb1;
    fd1 = ld0 + ld1;
    Output.points[8][1] += fd0;
    fb0 = !fb1;
    boolean lb2 = false;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0);
}
    fd1 = ld0 + ld1;
    boolean lb3 = true;

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
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    Thought lo0 = Thought153.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 561.4754687640517;
    ad1 = ad2 + ad3;
    double ld3 = 450.5601993301179;
        lb1 = ad3 > ad4;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb1 = fd0 > fd1;
    ld2 *= -1;
if(ao3 != null){
      ld3 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
    double ld4 = 266.48590388069306;
    boolean lb5 = false;
    double ld6 = 733.5542130445087;
    fb0 = fb1 && lb1;
    ad3 = ad4 - fd0;
    fd1 = ld2 - ld3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        double ld0 = 74.63069697856695;
        boolean lb1 = false;
        Output.points[8][2] += fd0;
        fd1 = ld0 + fd0;
if(ao2 != null){
          ab3 = ao2.m2(ab4, fb0, fb1, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ab1 = fd1 < ld0;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, fd0);
}
        ab2 = fd1 < ld0;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
        ab3 = fd1 < ld0;
        fd0 = fd1 - ld0;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
        }
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    fd0 *= -1;
    if (fb0) {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[8][3] -= ad2;
    ad3 *= -1;
    double ld0 = 503.1699636179604;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    boolean lb1 = false;
    Thought lo2 = Thought127.getInstance(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    lb1 = !ab1;
    boolean lb3 = true;
    ld0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = !ab2;

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
    Output.points[8][4] += fd0;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought124.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
    double ld3 = 728.4888925588396;
    lb1 = fd0 > fd1;
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2();
}
        double ld4 = 789.2381584286272;
if(fo0 != null){
          ld4 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld4, lb0, lb1, fb0, fb1);
}
        Output.points[8][5] += ld3;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Thought lo0 = Thought358.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
        boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    ad2 = ad3 - ad4;
    Output.points[8][6] += fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 - ad2;
        boolean lb0 = true;
        double ld1 = 713.4047959081386;
        ad2 *= -1;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
        ad1 = ad2 - ad3;
        boolean lb2 = true;
        fb0 = ad4 > fd0;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb0 = false;
    Thought lo1 = Thought151.getInstance();
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    double ld2 = 829.5497625545942;
    double ld3 = 142.67904850112888;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && ab1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    Output.points[8][7] -= fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought309.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
        double ld1 = 218.36223514285413;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    Thought lo2 = Thought118.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
    fb1 = fb0 && fb1;
    boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb3);
}
    boolean lb4 = true;
    Thought lo5 = Thought181.getInstance(ao1, ao2, ao3, ao4, lb4, fb0, fb1, lb3);
    Thought lo6 = Thought111.getInstance();
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, lb4, fb0, fb1, lb3);
}
    lb4 = fd1 > ld1;

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
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    Output.points[8][8] -= ad4;
    fb1 = !fb0;
    double ld0 = 799.046704165721;
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0);
}
    double ld1 = 408.7570258608852;
    fb1 = !fb0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    double ld2 = 807.9730449493328;
    ld0 = ld1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1();
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb3);
}
        boolean lb4 = false;
if(fo1 != null){
          fo1.m2(lb3, fb0, fb1, lb4);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        fd0 *= -1;
        fd1 = ld0 - ld1;
        lb3 = !fb0;
if(ao1 != null){
          fo1 = ao1.m4(ld2, ad1, ad2, ad3);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    fd0 *= -1;
    ab3 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    double ld1 = 350.62434418669557;
    fb0 = fb1 && lb0;
if(fo1 != null){
      ab1 = fo1.m2();
}
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(lb2, ab1, ab2, ab3);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 = ld1 - fd0;
if(ao1 != null){
      ab4 = ao1.m2(fd1, ld1, fd0, fd1);
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
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought369.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 = fd0 - fd1;
    ab3 = ab4 && fb0;
    Thought lo1 = Thought142.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
    boolean lb2 = true;
    boolean lb3 = false;
    Thought lo4 = Thought379.getInstance(ab2, ab3, ab4, fb0);
    fb1 = lb2 || lb3;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab3 = ao4.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    boolean lb5 = true;
    ab3 = ab4 && fb0;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb2, lb3, lb5, ab1);
}
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3();
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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    double ld1 = 593.7657224741585;
    Thought lo2 = Thought110.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
    lb0 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fd1 = ld1 - fd0;
    boolean lb3 = false;
    lb3 = fd1 > ld1;
    fb0 = !fb1;
    lb0 = !lb3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
    Thought lo5 = Thought319.getInstance(fd1, ld1, fd0, fd1);
    lb4 = !fb0;
    fb1 = lb0 || lb3;
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
    fb0 = fd0 < fd1;
    fd0 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = !fb1;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
    boolean lb3 = true;
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb4 = false;
    boolean lb5 = true;
    fd0 *= -1;
    lb5 = fd1 < fd0;
    boolean lb6 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb6, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(lb1, lb2, lb3, lb4);
}
    boolean lb7 = false;
    lb5 = fd0 > fd1;
    boolean lb8 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
        double ld9 = 921.3623728359897;

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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought219.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[0][0] -= fd0;
    fd1 *= -1;
    Thought lo1 = Thought287.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld2 = 127.77128632529036;
    ld2 *= -1;
    fd0 = fd1 + ld2;
    fd0 = fd1 - ld2;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    double ld3 = 683.0081055484197;
    Thought lo4 = Thought47.getInstance(fb0, fb1, fb0, fb1);
    boolean lb5 = true;
    boolean lb6 = true;
    ld3 *= -1;
    boolean lb7 = false;

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
