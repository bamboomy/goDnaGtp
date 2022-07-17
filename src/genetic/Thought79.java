package genetic;
import java.util.ArrayList;
class Thought79 extends Thought{
private static ArrayList<Thought79> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 973.4965572689326;
private double fd1 = 692.115481922811;
private Thought fo0 = null;
private Thought fo1 = null;
Thought79 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought79 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought79 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought79 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought79 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[6][7] += fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 480.0873505355191;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = !fb0;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    Thought lo2 = Thought2.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    fb1 = !lb1;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
    Thought lo3 = Thought71.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m1();
}
    fb0 = fb1 && lb1;
    boolean lb4 = false;
    lb4 = !fb0;
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb4, fb0, fb1, lb1);
}
    Thought lo5 = Thought229.getInstance(lb4, fb0, fb1, lb1);
    lb4 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld6 = 381.0136332131118;
    boolean lb7 = true;

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
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    Thought lo1 = Thought55.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Output.points[6][8] += fd0;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 && ab1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought48.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    double ld1 = 374.4447555207737;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[7][0] -= fd1;
if(fo0 != null){
      fo0.m2(ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb0 = fd0 > fd1;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fd1 *= -1;
    ld1 = ad1 - ad2;
    Output.points[7][1] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m2(fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;

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
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1();
}
        ab1 = ab2 && ab3;
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
        boolean lb0 = false;
        ab1 = ad3 < ad4;
        ab2 = !ab3;
        fd0 *= -1;
        double ld1 = 301.71839331157366;
        Output.points[7][2] += fd0;
        double ld2 = 593.2597067610409;
        ab4 = fd0 < fd1;
        fb0 = ld1 > ld2;
        Output.points[7][3] += ad1;
        double ld3 = 248.96147735493832;
if(fo0 != null){
          ad1 = fo0.m3(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        boolean lb4 = false;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought214.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought285.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
    boolean lb3 = true;
if(ao1 != null){
      ao1.m3(lb3, fb0, fb1, lb1);
}
    boolean lb4 = true;
    fd0 = fd1 + fd0;
    boolean lb5 = false;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb6 = true;

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
    Output.points[7][4] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
    double ld0 = 147.673197380202;
    fb0 = !fb1;
    Thought lo1 = Thought102.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    double ld4 = 588.8359346599192;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, lb3, fb0, fb1);
}
    Thought lo5 = Thought245.getInstance();
    lb2 = fd0 > fd1;
    lb3 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld4, ad1, ad2, lb2, lb3, fb0, fb1);
}
    boolean lb6 = false;
if(ao2 != null){
      ao2.m2(lb2, lb3, lb6, fb0);
}
    double ld7 = 336.75372974940603;
    fb1 = !lb2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld4, ld7);
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      lb3 = ao4.m2(ad4, fd0, fd1, ld0, lb6, fb0, fb1, lb2);
}
    ld4 *= -1;

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
    double ld0 = 147.13091922136786;
    ab2 = ld0 < fd0;
    ab3 = fd1 > ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 = fd0 + fd1;
    boolean lb1 = true;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb1, ab1, ab2);
}
    boolean lb2 = false;
    ld0 = fd0 + fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb1;
    ld0 = fd0 - fd1;
    boolean lb3 = false;
    lb2 = ld0 < fd0;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo4 = Thought238.getInstance(fd1, ld0, fd0, fd1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = fd1 > ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    Output.points[7][5] += fd1;
    lb2 = ld0 < fd0;
    lb3 = fd1 > ld0;

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
    ab2 = !ab3;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought206.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
        Output.points[7][6] -= ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    boolean lb1 = true;

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
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 99.87092308321567;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought149.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    boolean lb3 = false;
    fb0 = fb1 && lb2;
    fd1 = ld0 - fd0;
    boolean lb4 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
    boolean lb5 = true;
    lb2 = lb3 && lb4;
    lb5 = fb0 && fb1;
    ld0 *= -1;

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
    ab2 = !ab3;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fb1 = lb0 || ab1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1();
}
    fd1 = fd0 - fd1;
    ab1 = !ab2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;

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
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    Output.points[7][7] -= ad2;
    lb0 = fb0 && fb1;
    double ld1 = 700.710455883291;
    Thought lo2 = Thought354.getInstance(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ld1 - ad1;
    Thought lo3 = Thought325.getInstance(ad2, ad3, ad4, fd0);
    Thought lo4 = Thought312.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
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
    ab1 = ab2 && ab3;
    boolean lb0 = false;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
    ad1 = ad2 + ad3;
        fb1 = ad4 < fd0;
    fd1 *= -1;
    boolean lb1 = true;
    lb0 = ad1 < ad2;
    Thought lo2 = Thought17.getInstance(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
if(fo1 != null){
      ad3 = fo1.m3();
}
    boolean lb3 = false;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld1 = 382.72058705417777;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
    double ld2 = 485.57184906759;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2);
}
    Output.points[7][8] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, ld2, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = ld1 - ld2;
    boolean lb3 = false;
    Thought lo4 = Thought393.getInstance(fo1, ao1, ao2, ao3, lb0, lb3, fb0, fb1);
if(ao4 != null){
      ao4.m3();
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
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    Thought lo2 = Thought184.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
    Output.points[8][0] -= fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought265.getInstance(lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo4 = Thought252.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
    boolean lb5 = false;
    ad3 *= -1;
    Output.points[8][1] += ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    lb1 = lb5 || fb0;
    ad4 = fd0 - fd1;
if(ao4 != null){
      fb1 = ao4.m2(ad1, ad2, ad3, ad4, lb0, lb1, lb5, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb0, lb1, lb5, fb0);
}
    fb1 = !lb0;
    lb1 = lb5 && fb0;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    double ld1 = 569.9565867382254;
    boolean lb2 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1);
}
    ab1 = ab2 || ab3;
    double ld4 = 672.6265453988092;
    ab4 = ld4 < fd0;

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
    Thought lo0 = Thought17.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    ab1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 > ad4;
        fd0 = fd1 - ad1;
    double ld1 = 609.4267532367647;
if(fo1 != null){
      fo1.m3();
}
    boolean lb2 = true;
    ab2 = ad1 < ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (lb2) {
        ab1 = ld1 < ad1;
        boolean lb3 = false;
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
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought203.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    fb0 = fd1 > fd0;
    Output.points[8][2] += fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 + fd1;

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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = fd0 > fd1;
    boolean lb0 = false;
    double ld1 = 169.1025543400694;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    Output.points[8][3] -= ld1;
    fd0 *= -1;
    boolean lb2 = false;
    lb2 = !ab1;
    boolean lb3 = false;
    ab1 = ab2 && ab3;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld5 = 834.1670595443549;
    Output.points[8][4] += fd0;
    ab3 = ab4 && fb0;
    fb1 = lb0 && lb2;
    Thought lo6 = Thought121.getInstance(fd1, ld1, ld5, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld5, fd0);
}
    fd1 = ld1 + ld5;
    Thought lo7 = Thought76.getInstance(fd0, fd1, ld1, ld5, lb3, lb4, ab1, ab2);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 < ld1;
    ld5 = fd0 + fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3();
}
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    double ld2 = 145.75996705225535;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought208.getInstance(fo1, fo0, fo1, fo0);
        boolean lb4 = false;
        lb4 = !lb0;
        boolean lb5 = false;
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld2);
}
        lb0 = !lb1;
        boolean lb6 = true;
        Thought lo7 = Thought8.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
        lb1 = fd0 > fd1;
        fb0 = fb1 || lb4;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
    Thought lo0 = Thought374.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
        fb1 = ab1 && ab2;
        Thought lo1 = Thought95.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
        boolean lb2 = true;
        ad3 = ad4 + fd0;
        ab2 = ab3 && ab4;
        fd1 = ad1 - ad2;
        double ld3 = 904.7527541838103;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
}
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
            fd1 = ld3 + ad1;
            ad2 *= -1;
            Output.points[8][5] -= ad3;
            ad4 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    Thought lo1 = Thought139.getInstance(fb1, lb0, fb0, fb1);
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    boolean lb2 = false;
    Output.points[8][6] += fd1;
    fd0 *= -1;
    Output.points[8][7] += fd1;
    boolean lb3 = true;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        lb2 = fd0 < fd1;
        fd0 *= -1;
        fd1 *= -1;
        }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo4 = Thought279.getInstance(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
    Thought lo5 = Thought33.getInstance(fo1, ao1, ao2, ao3, lb2, lb3, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, lb2, lb3, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb2, lb3);
}
    boolean lb6 = false;

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
    fb1 = ad1 < ad2;
    Output.points[8][8] += ad3;
    fb0 = !fb1;
    ad4 = fd0 - fd1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    boolean lb0 = false;
    double ld1 = 976.8467542562178;
    fb0 = ad4 > fd0;
    Output.points[0][0] -= fd1;
    if (fb1) {
        Thought lo2 = Thought381.getInstance(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
        Thought lo3 = Thought286.getInstance(ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
        boolean lb4 = false;
        lb0 = !fb0;
        fb1 = ad1 > ad2;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb4, lb0, fb0, fb1);
}
        Output.points[0][1] -= ad3;
        Thought lo5 = Thought0.getInstance();
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1, lb4, lb0, fb0, fb1);
}
        lb4 = lb0 || fb0;
        for(int i0=0; i0<10; i0++){
            fb1 = ad2 < ad3;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(lb0, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    ab4 = !fb0;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    ab4 = fd1 < fd0;
    double ld3 = 102.64077541396502;
    Output.points[0][2] += fd0;
    fb0 = fd1 > ld3;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld3, fd0);
}
    fd1 *= -1;
    ld3 = fd0 - fd1;
    double ld4 = 661.7859018288414;
    Thought lo5 = Thought79.getInstance(ao2, ao3, ao4, fo0, ld3, ld4, fd0, fd1);
    Thought lo6 = Thought175.getInstance(ld3, ld4, fd0, fd1, fb1, lb0, lb1, lb2);
    double ld7 = 717.9845689980874;
    ld3 = ld4 + ld7;
    Thought lo8 = Thought207.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
    Output.points[0][3] += fd0;
    fd1 = ld3 - ld4;

Thought.STACK_COUNTER++;
return ld7;
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
      ao2.m2();
}
    if (ab2) {
        ab3 = ad2 < ad3;
        Thought lo0 = Thought70.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
if(ao2 != null){
          ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
        if (fb1) {
            for(int i0=0; i0<10; i0++){
if(ao3 != null){
                  ab1 = ao3.m2(ao4, fo0, fo1, ao1);
}
                ad2 = ad3 - ad4;
                fd0 = fd1 + ad1;
                ad2 *= -1;
}}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 541.5892538045309;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought25.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][4] -= ld0;
    boolean lb2 = true;
    Output.points[0][5] -= fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    Output.points[0][6] += fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb3 = fo1.m2(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    boolean lb4 = true;
    double ld5 = 819.3240675666618;
    ld0 = ld5 - fd0;
    lb4 = !fb0;

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
    double ld0 = 584.931193530746;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld0;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    double ld1 = 496.8022123171498;
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    boolean lb2 = false;
    ab3 = ab4 || fb0;
    boolean lb3 = false;
    fb0 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb2, lb3, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    double ld1 = 538.0668368611637;
    boolean lb2 = false;
    Thought lo3 = Thought265.getInstance(ad4, fd0, fd1, ld1);
    ad1 *= -1;
    Output.points[0][7] -= ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld4 = 708.8860031524229;
if(fo0 != null){
      lb2 = fo0.m2(ld1, ld4, ad1, ad2, fb0, fb1, lb0, lb2);
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    Output.points[0][8] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 737.155580933251;
    double ld1 = 417.99003121053397;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    double ld2 = 911.2055708909379;
    double ld3 = 749.924364709292;
    Output.points[1][0] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    ab2 = ld2 < ld3;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    ld0 = ld1 + ld2;
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    ab1 = ab2 && ab3;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ld2, fb0, fb1, ab1, ab2);
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
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 785.3889117651647;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[1][1] += ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    fb0 = !fb1;
    boolean lb2 = false;
    boolean lb3 = false;
    lb1 = lb2 && lb3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb1);
}
    lb2 = !lb3;
    Thought lo4 = Thought247.getInstance();
    double ld5 = 231.93260599809813;
    fb0 = ld5 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld5, fd0, fb1, lb1, lb2, lb3);
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    lb3 = fb0 || fb1;
    boolean lb6 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    Output.points[1][2] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought100.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought97.getInstance();
    Thought lo2 = Thought55.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    Thought lo3 = Thought234.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
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
    ab2 = ab3 || ab4;
    double ld0 = 639.9261981284952;
    fb0 = fd0 < fd1;
    double ld1 = 394.12428724169115;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ld0 = ld1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    Thought lo2 = Thought373.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 *= -1;
    fb1 = ld1 < fd0;
    boolean lb3 = false;
    lb3 = ab1 && ab2;
if(ao2 != null){
      ao2.m3(fd1, ld0, ld1, fd0);
}
    boolean lb4 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought132.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    Thought lo2 = Thought306.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fb1, lb1, ab1, ab2);
}
    Thought lo3 = Thought297.getInstance(ao1, ao2, ao3, ao4);
    boolean lb4 = false;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ab4 = fb0 && fb1;
    double ld5 = 38.46686050782717;
    Thought lo6 = Thought89.getInstance(ad2, ad3, ad4, fd0, lb1, lb4, ab1, ab2);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
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
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][3] += fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
        fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fd0 *= -1;
    boolean lb0 = false;
    Output.points[1][4] += fd1;
    Output.points[1][5] -= fd0;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
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
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = false;
    double ld1 = 95.71336657130679;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
    fd0 *= -1;
    boolean lb2 = true;
    lb0 = lb2 && fb0;
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought295.getInstance(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld1;
    lb2 = !lb3;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, lb2, lb3);
}
    double ld5 = 696.213727531838;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    ld5 *= -1;
    fd0 *= -1;
    lb3 = fd1 > ld1;
    Thought lo6 = Thought268.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && lb0;
    Output.points[1][6] += ld5;

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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo0.m1(fb1, lb0, fb0, fb1);
}
        fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = !fb0;
    boolean lb1 = true;

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
