package genetic;
import java.util.ArrayList;
class Thought76 extends Thought{
private static ArrayList<Thought76> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 175.155961592294;
private double fd1 = 225.85535121288567;
private Thought fo0 = null;
private Thought fo1 = null;
Thought76 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought76 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought76 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought76 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought76 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought76 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought76 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought76 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought76 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
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
    ab2 = ab3 && ab4;
    fd1 *= -1;
    double ld0 = 696.0254104343717;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    boolean lb1 = true;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
        double ld2 = 867.7789536243334;
    boolean lb3 = false;
    boolean lb4 = false;
    fd0 = fd1 + ld0;
    ab2 = !ab3;
    boolean lb5 = false;
    ab3 = ld2 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
}
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
    fb1 = !fb0;
    boolean lb0 = false;
    Thought lo1 = Thought40.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
    if (lb0) {
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        fb0 = ad4 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          lb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        fb0 = ad2 > ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        fb1 = ad3 > ad4;
        lb0 = fd0 < fd1;
        fb0 = ad1 < ad2;
        ad3 = ad4 + fd0;
        fd1 *= -1;
        Thought lo2 = Thought16.getInstance(fb1, lb0, fb0, fb1);
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb3 = lb0 && fb0;
        Output.points[5][1] += ad1;
        fb1 = ad2 > ad3;
if(fo1 != null){
          fo1.m1(ad4, fd0, fd1, ad1, lb3, lb0, fb0, fb1);
}
        ad2 *= -1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ab3 = ab4 || fb0;
    double ld0 = 916.1635735215646;
    double ld1 = 966.201640397657;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - ld1;
    Output.points[5][2] += ad1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought96.getInstance();
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld1 = 985.0324464486076;
    boolean lb2 = true;
    ld1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(ao4 != null){
          lb2 = ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb2, fb0, fb1);
}
    ld1 = fd0 + fd1;
    lb2 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 > ld1;

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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    boolean lb0 = true;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought57.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m1(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb0;
    Output.points[5][3] += fd1;
    fb0 = ad1 > ad2;
        Output.points[5][4] += ad3;

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
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought34.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought19.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    double ld2 = 321.6525393748235;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    fd0 *= -1;
    fd1 *= -1;
    ld2 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
    fd1 = ld2 + fd0;
if(ao1 != null){
      ao1.m1(fd1, ld2, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ld2 < fd0;
    ab2 = ab3 && ab4;
        fb0 = !fb1;

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
    Output.points[5][5] += ad1;
    ad2 *= -1;
    ab1 = ab2 && ab3;
    ad3 = ad4 + fd0;
        ab4 = fd1 < ad1;
    boolean lb0 = true;
    Thought lo1 = Thought54.getInstance(ao2, ao3, ao4, fo0);
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;

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
    Thought lo0 = Thought20.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    Output.points[5][6] += fd1;
    double ld1 = 19.15078032947444;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    Output.points[5][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
          fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ld1 *= -1;
    fd0 = fd1 + ld1;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    Output.points[5][8] -= ld1;
    fb0 = fd0 > fd1;
    fb1 = ld1 < fd0;
    double ld3 = 481.26920698195465;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld1, ld3, lb2, fb0, fb1, lb2);
}
    Thought lo4 = Thought70.getInstance(fo0, fo1, fo0, fo1);

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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m3(fb1, lb0, ab1, ab2);
}
    boolean lb1 = false;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = !lb0;
    lb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought99.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = fd1 < fd0;
    fd1 *= -1;

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
    ad1 = ad2 - ad3;
        if (fb1) {
        Output.points[6][0] -= ad4;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
        Thought lo1 = Thought58.getInstance(ad2, ad3, ad4, fd0);
        fd1 *= -1;
        boolean lb2 = false;
        double ld3 = 810.8494287644309;
if(fo1 != null){
          ld3 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld4 = 652.7906037497683;
        Thought lo5 = Thought45.getInstance(lb2, fb0, fb1, lb0);
        ad4 = fd0 + fd1;
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
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    lb0 = ab1 && ab2;
    ad4 *= -1;
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Output.points[6][1] += ad3;
    lb1 = ad4 < fd0;
    ab1 = ab2 && ab3;
    fd1 = ad1 - ad2;
    boolean lb2 = true;
    Thought lo3 = Thought83.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    lb0 = lb1 && lb2;
    Thought lo4 = Thought77.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    boolean lb5 = true;
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4);
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
    if (fb1) {
        fd0 *= -1;
        Thought lo0 = Thought62.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        double ld1 = 379.9677306992737;
        fb0 = fd0 > fd1;
        ld1 = fd0 - fd1;
        fb1 = fb0 || fb1;
        double ld2 = 912.4180379830547;
if(fo0 != null){
          fo0.m1(fb0, fb1, fb0, fb1);
}
        boolean lb3 = false;
        double ld4 = 502.42384120705987;
        Thought lo5 = Thought78.getInstance();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    double ld0 = 399.45273073505274;
    Output.points[6][2] += ad2;
    double ld1 = 909.2989170165641;
    fb0 = ad2 > ad3;
if(ao2 != null){
      fb1 = ao2.m2(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    ld1 *= -1;
    boolean lb3 = false;
    ad1 *= -1;
    lb2 = ad2 > ad3;
    lb3 = !fb0;
    boolean lb4 = true;
    boolean lb5 = false;
    ad4 = fd0 + fd1;
    Thought lo6 = Thought0.getInstance(ao3, ao4, fo0, fo1);
    ld0 = ld1 + ad1;
    Thought lo7 = Thought9.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb5, fb0, fb1, lb2);
    boolean lb8 = false;
    Thought lo9 = Thought59.getInstance(fo0, fo1, ao1, ao2, lb3, lb4, lb5, lb8);
    boolean lb10 = true;
    lb10 = fd1 < ld0;
    Thought lo11 = Thought72.getInstance(ld1, ad1, ad2, ad3);
    fb0 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ad1);
}
    fb1 = ad2 < ad3;
    lb2 = lb3 && lb4;
    lb5 = lb8 && lb10;

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
    Output.points[6][3] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ab1 = ao4.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
    boolean lb0 = false;
    Thought lo1 = Thought59.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    lb0 = ab1 && ab2;
    boolean lb2 = true;
    ab2 = fd0 < fd1;
    double ld3 = 247.74131970660983;
    ld3 *= -1;
    ab3 = ab4 || fb0;

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
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = ad2 < ad3;
    boolean lb2 = false;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1, lb1, lb2, ab1, ab2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, lb1, lb2, ab1, ab2);
}
    double ld3 = 369.3755245326266;
    Thought lo4 = Thought57.getInstance(ld3, ad1, ad2, ad3);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld3);
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1();
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    double ld0 = 816.4503401936436;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 976.9495325320668;
    fb0 = fd0 > fd1;
    boolean lb2 = false;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fb0 = fo0.m2(ld1, fd0, fd1, ld0);
}
    fb1 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(lb2, lb3, fb0, fb1);
}
    lb2 = ld0 > ld1;
        fd0 *= -1;
    fd1 = ld0 - ld1;

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
    fd1 *= -1;
    ab2 = fd0 > fd1;
    Output.points[6][4] += fd0;
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = !fb0;
    fd1 = fd0 + fd1;
    Output.points[6][5] += fd0;
    fb1 = ab1 && ab2;
    double ld0 = 950.8895419987547;
    ab3 = fd0 > fd1;
    ab4 = ld0 < fd0;
    boolean lb1 = true;
    double ld2 = 598.42599021424;
    ab4 = fd0 > fd1;
    ld0 *= -1;
    Output.points[6][6] += ld2;
    fb0 = fb1 || lb1;
    ab1 = ab2 && ab3;
    Output.points[6][7] -= fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, ld2, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 523.4136205997665;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
        ad3 *= -1;
    Output.points[6][8] += ad4;
    Thought lo1 = Thought50.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    ad2 = ad3 + ad4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld0, ad1, fb0, fb1, lb2, fb0);
}
    fb1 = ad2 > ad3;

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
    Thought lo0 = Thought72.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ab3 = ab4 || fb0;
    Thought lo1 = Thought53.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
        if (ab1) {
            ab2 = ab3 && ab4;
            boolean lb2 = false;
            ad1 *= -1;
            Thought lo3 = Thought31.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
            fd1 *= -1;
            boolean lb4 = false;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            ad1 *= -1;
            boolean lb5 = false;
            } else {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought85.getInstance(fb1, fb0, fb1, fb0);
    Output.points[7][0] -= fd0;
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    double ld1 = 419.4243999872155;
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
    double ld2 = 937.8275385162965;
    ld2 = fd0 - fd1;
    fb1 = fb0 && fb1;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
    lb3 = !fb0;

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
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Thought lo0 = Thought5.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    double ld1 = 814.5398697381542;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = fd0 < fd1;
        ld1 = ad1 - ad2;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Thought lo2 = Thought61.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
        ld1 = ad1 - ad2;
        fb0 = ad3 > ad4;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
        fd1 *= -1;
        ld1 *= -1;
        boolean lb3 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb3, fb0);
}
        double ld4 = 402.9221624889312;
        ad4 *= -1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb1, lb3, fb0, fb1);
}
        fd0 *= -1;
        double ld5 = 10.199406480877606;
        fd0 = fd1 + ld4;
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Output.points[7][1] -= fd0;
    fd1 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
    fb0 = fd1 > fd0;
    fb1 = lb0 || lb1;
    ab1 = fd1 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, lb1, ab1);
}
    Output.points[7][2] += fd0;
    ab2 = ab3 || ab4;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought62.getInstance();
    fd1 *= -1;
    Thought lo1 = Thought93.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fd0 *= -1;
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 *= -1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought65.getInstance();
    ab1 = ad4 > fd0;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[7][3] += fd0;
        fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought39.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought56.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = !ab1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fd1 > fd0;
    boolean lb2 = true;
    fd1 *= -1;
    Thought lo3 = Thought99.getInstance(lb2, ab1, ab2, ab3);
    ab4 = !fb0;
    fd0 *= -1;
    fb1 = lb0 || lb1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    lb2 = !ab1;
    fd0 = fd1 - fd0;
    double ld4 = 587.1117647270958;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld4, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[7][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, lb0, lb1, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
    fd0 = fd1 - ld4;
    lb2 = fd0 < fd1;
    ab1 = ld4 > fd0;

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
    double ld0 = 690.8150594931632;
    double ld1 = 860.7516021622143;
    fb0 = !fb1;
    Thought lo2 = Thought37.getInstance(ld0, ld1, ad1, ad2);
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb3 = fb0 || fb1;
    lb3 = ld0 < ld1;
    Output.points[7][5] -= ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
    Output.points[7][6] -= fd0;
    fb1 = lb3 || fb0;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 782.9060049093531;
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 = ad1 + ad2;
    Output.points[7][7] -= ad3;
    fb1 = ad4 < fd0;
    boolean lb1 = false;
    lb1 = fd1 > ld0;
    Output.points[7][8] -= ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;

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
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        double ld0 = 372.15735404007;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
        fb0 = fd1 > ld0;
        if (fb1) {
            fb0 = fd0 < fd1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
            boolean lb1 = true;
if(ao2 != null){
              fd0 = ao2.m3(fb0, fb1, lb1, fb0);
}
            fb1 = lb1 || fb0;
            fd1 *= -1;
            Thought lo2 = Thought61.getInstance();
            boolean lb3 = true;
            Output.points[8][0] += ld0;
if(ao3 != null){
              fb0 = ao3.m2(fd0, fd1, ld0, fd0, fb1, lb1, lb3, fb0);
}
            fb1 = !lb1;
if(ao4 != null){
              lb3 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb3);
}
            fb0 = ld0 > fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 60.90760892733199;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
}
if(ao4 != null){
      ad2 = ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    ad4 = fd0 + fd1;
    ld0 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;

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
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        double ld0 = 400.2618514330831;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
        ld0 = fd0 + fd1;
        double ld1 = 527.6550060280205;
if(ao2 != null){
          ao2.m3(ld0, ld1, fd0, fd1);
}
        boolean lb2 = false;
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          ao4.m2();
}
        ld0 = ld1 + fd0;
        fb1 = lb2 && ab1;
if(fo0 != null){
          fo0.m3(fd1, ld0, ld1, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought25.getInstance(fo1, ao1, ao2, ao3);
        fb1 = !lb2;
        Thought lo4 = Thought32.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0, ab1, ab2, ab3, ab4);
        }
    Thought lo5 = Thought64.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    Thought lo6 = Thought74.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    for(int i1=0; i1<10; i1++){
if(fo1 != null){
          fd1 = fo1.m3();
}
        fd0 *= -1;
if(ao1 != null){
          ao1.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        double ld7 = 638.3873995338515;
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
    Output.points[8][1] += ad2;
    double ld0 = 499.30405496421344;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld1 = 508.79134732256244;
    ad4 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(ao1 != null){
      ao1.m3(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ad2 < ad3;
    Output.points[8][2] -= ad4;
    boolean lb2 = true;
    fd0 = fd1 - ld0;

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
    fb0 = fd1 < fd0;
    Thought lo0 = Thought41.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        Thought lo1 = Thought64.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[8][3] += fd0;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, fb0, fb1);
}
    lb2 = fb0 && fb1;
    Thought lo3 = Thought69.getInstance();
    boolean lb4 = true;
    lb2 = !lb4;
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb2;
if(fo0 != null){
      lb4 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb4);
}
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb2);
}
    fd0 *= -1;
    boolean lb6 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb4, lb5, lb6, fb0);
}
    fb1 = !lb2;
    lb4 = fd1 > fd0;
if(fo1 != null){
      lb5 = fo1.m2(fd1, fd0, fd1, fd0);
}
    lb6 = fd1 < fd0;

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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    double ld0 = 464.23662669796647;
if(fo1 != null){
          fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb1 = !fb0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought7.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    ld0 = fd0 - fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 *= -1;
    boolean lb2 = true;
    fb0 = !fb1;
    lb2 = fb0 || fb1;
    lb2 = fb0 || fb1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 78.86799567703243;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ld1 = fd0 - fd1;
    double ld2 = 134.8568023848338;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    ld1 = ld2 + fd0;
    lb0 = !lb3;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(fd1, ld1, ld2, fd0);
}
    lb4 = !fb0;
    fd1 = ld1 - ld2;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
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
