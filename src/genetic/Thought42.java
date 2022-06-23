package genetic;
import java.util.ArrayList;
class Thought42 extends Thought{
private static ArrayList<Thought42> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 964.0999998257448;
private double fd1 = 44.44734841992935;
private Thought fo0 = null;
private Thought fo1 = null;
Thought42 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought42 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought42 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought42 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought42 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
    boolean lb0 = false;
    Output.points[3][6] += fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    lb0 = lb1 && fb0;
    fb1 = fd1 < fd0;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, lb3);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
        fb1 = fd0 > fd1;
    Thought lo4 = Thought67.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
    fb0 = fb1 || lb0;
    lb1 = fd0 < fd1;
    lb2 = lb3 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought44.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo0 = Thought72.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    Output.points[3][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = fb0 || fb1;
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought8.getInstance(fo0, fo1, fo0, fo1);
    Thought lo2 = Thought49.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;

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
    fb1 = ad2 < ad3;
    boolean lb0 = false;
    Output.points[3][8] += ad4;
    double ld1 = 788.2402035022159;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld1);
}
    double ld2 = 379.8858495677638;
    lb0 = !fb0;
    ld2 = ad1 + ad2;
    ad3 = ad4 - fd0;
    double ld3 = 324.64195040639964;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
    boolean lb4 = true;
    double ld5 = 85.07848473539104;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb4);
}
    double ld6 = 720.0479766404777;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ld3 < ld5;
if(fo0 != null){
      fo1 = fo0.m4(ld6, ad1, ad2, ad3, fb1, lb0, lb4, fb0);
}
    Output.points[4][0] -= ad4;
    Thought lo7 = Thought16.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb1, lb0, lb4, fb0);
}
    Thought lo8 = Thought96.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ld3, ld5, ld6, ad1);
}
    fb1 = ad2 > ad3;
    double ld9 = 111.07073309612574;
    Output.points[4][1] += ad3;
    boolean lb10 = false;

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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought79.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fd1 *= -1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    Output.points[4][2] -= ad2;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought79.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);

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
    fb0 = fd1 < fd0;
    double ld0 = 514.3503508206212;
    fb1 = fd0 > fd1;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m3(ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Thought lo2 = Thought16.getInstance(lb1, fb0, fb1, lb1);
    fb0 = ld0 < fd0;
    fd1 = ld0 + fd0;
    Thought lo3 = Thought44.getInstance();

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
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought80.getInstance(ad1, ad2, ad3, ad4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    double ld2 = 488.9120068574523;
    ld2 *= -1;
if(ao4 != null){
      ao4.m1();
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
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 - fd1;
    double ld0 = 444.95742299597987;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[4][3] -= ld0;
    fb0 = fd0 > fd1;

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
    ab2 = ab3 || ab4;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = ab1 && ab2;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 *= -1;
    Thought lo1 = Thought6.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;

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
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        boolean lb0 = false;
        boolean lb1 = false;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
        Thought lo2 = Thought48.getInstance();
        Output.points[4][4] += fd0;
        lb1 = fd1 < fd0;
if(fo0 != null){
          fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
        fb1 = !lb0;
        lb1 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fd1 < fd0;
        Thought lo3 = Thought97.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
        boolean lb4 = false;
        boolean lb5 = false;
        boolean lb6 = true;
        lb5 = lb6 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb4);
}
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
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd1 < fd0;
    lb1 = ab1 && ab2;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    ab3 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    double ld3 = 986.4551220205633;
if(fo0 != null){
          fo1 = fo0.m4();
}
    Thought lo4 = Thought5.getInstance(fd0, fd1, ld3, fd0, lb1, lb2, ab1, ab2);
    fd1 = ld3 - fd0;
    boolean lb5 = true;
    ab2 = !ab3;
    Thought lo6 = Thought4.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ld3 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, lb5, ab1, ab2);
}
    Output.points[4][5] -= ld3;
    ab3 = ab4 && fb0;
    double ld7 = 346.66828001774104;
if(fo1 != null){
      fo1.m1(ld7, fd0, fd1, ld3);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld7, fd0, fd1, ld3);
}
    double ld8 = 830.963177086985;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought79.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = fd1 > ad1;
    fb1 = !lb1;
    fb0 = !fb1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb1 = !lb1;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
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
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought38.getInstance();
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
        boolean lb1 = false;
        Thought lo2 = Thought38.getInstance(fo0, fo1, fo0, fo1);
        double ld3 = 756.6155878181147;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ld3 = ad1 - ad2;
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
        Thought lo4 = Thought55.getInstance(ad4, fd0, fd1, ld3);
        ad1 *= -1;
        ab4 = !fb0;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2);
}
        boolean lb5 = true;
        for(int i1=0; i1<10; i1++){
            ad3 = ad4 - fd0;
if(fo0 != null){
              fo0.m2(fb0, fb1, lb1, lb5);
}
            Thought lo6 = Thought57.getInstance();
}}
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
    double ld0 = 214.1139036806597;
    if (fb1) {
if(ao2 != null){
          ao2.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
        Thought lo1 = Thought11.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
        boolean lb2 = false;
        fb0 = fd1 > ld0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, ld0, fd0);
}
if(ao1 != null){
          lb2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        ad3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo0 = Thought89.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        boolean lb1 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[4][6] -= ad2;
        lb1 = fb0 && fb1;
        double ld2 = 953.1083594993329;
        lb1 = ad2 > ad3;
        if (fb0) {
            ad4 = fd0 - fd1;
            Thought lo3 = Thought66.getInstance(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
            boolean lb4 = false;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb4, lb1, fb0, fb1);
}
            lb4 = lb1 || fb0;
            boolean lb5 = false;
            Thought lo6 = Thought57.getInstance(ad4, fd0, fd1, ld2);
            fb0 = !fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, lb1, ab1);
}
    ab2 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld0 = 900.7619459759189;
    boolean lb1 = false;
    if (lb1) {
        ad1 = ad2 - ad3;
        ab1 = ad4 > fd0;
        double ld2 = 598.0297638318411;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab2 = ab3 && ab4;
        fd0 *= -1;
        fb0 = fd1 > ld2;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    Thought lo0 = Thought46.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    double ld1 = 172.37915956737203;
    Output.points[4][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ld1 - fd0;
    fd1 = ld1 + fd0;
    fb0 = fd1 < ld1;

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
    double ld0 = 252.60834044657548;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fd1 < ld0;
    ab1 = !ab2;
    boolean lb2 = true;
    fd0 = fd1 - ld0;
    boolean lb3 = false;
    double ld4 = 98.56365161260736;
    ld4 *= -1;
if(fo1 != null){
      fo1.m2();
}
    double ld5 = 691.3122856956652;
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld4, ld5, fd0, fd1, fb1, lb1, lb2, lb3);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld4, ld5, fd0);
}
    lb1 = !lb2;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld4, ld5, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb3, ab1, ab2, ab3);
}
    fd1 = ld0 - ld4;
    ld5 = fd0 + fd1;

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
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought79.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = ad1 < ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    for(int i0=0; i0<10; i0++){
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
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    Thought lo0 = Thought16.getInstance(fb1, ab1, ab2, ab3);
    boolean lb1 = true;
    fd0 = fd1 - ad1;
    boolean lb2 = false;
    ab2 = !ab3;
    Thought lo3 = Thought5.getInstance();
    ab4 = fb0 || fb1;
    boolean lb4 = false;
    double ld5 = 795.7233192956503;
    lb1 = !lb2;
    lb4 = ad1 > ad2;
    boolean lb6 = true;
    boolean lb7 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld5, ad1, ad2, lb6, lb7, ab1, ab2);
}
    ab3 = ad3 < ad4;
    ab4 = fb0 && fb1;
    lb1 = lb2 || lb4;
    fd0 = fd1 + ld5;
    lb6 = ad1 > ad2;

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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fd0 = fd1 - fd0;
        lb0 = fb0 || fb1;
        fd1 = fd0 + fd1;
        lb0 = fb0 || fb1;
        lb0 = !fb0;
        fb1 = fd0 > fd1;
        lb0 = fb0 || fb1;
        boolean lb1 = true;
        double ld2 = 520.7627008255964;
        lb0 = ld2 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd1 = ld2 + fd0;
        for(int i1=0; i1<10; i1++){
            }
        Output.points[4][8] += fd1;
        double ld3 = 231.68350564887015;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ld2, ld3, fd0, fd1, lb1, fb0, fb1, lb0);
}
        boolean lb4 = true;
        lb1 = ld2 > ld3;
        Thought lo5 = Thought18.getInstance(ao1, ao2, ao3, ao4, lb4, fb0, fb1, lb0);
        lb1 = lb4 || fb0;
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
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(ao2 != null){
      fd1 = ao2.m3(lb1, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        lb1 = ad1 < ad2;
if(ao3 != null){
          fb0 = ao3.m2();
}
        boolean lb2 = false;
        fb0 = !fb1;
if(ao4 != null){
          ad3 = ao4.m3(ad4, fd0, fd1, ad1, lb2, lb0, lb1, fb0);
}
        fb1 = lb2 || lb0;
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought42.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
    Output.points[5][0] -= fd1;
    double ld4 = 650.0620872405475;
    Output.points[5][1] -= ld4;

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[5][2] += fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb0 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought18.getInstance();
    lb0 = ab1 && ab2;
if(ao4 != null){
      ab3 = ao4.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Output.points[5][3] -= fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb0, lb2, ab1, ab2);
}
    ab3 = !ab4;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, lb2, ab1);
}
    Thought lo3 = Thought23.getInstance();
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld4 = 895.4673171283038;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld4, lb2, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought63.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb1 = !ab1;
    Thought lo1 = Thought56.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    fb1 = ab1 && ab2;
    Output.points[5][4] -= ad3;
if(ao3 != null){
      ao3.m1(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Output.points[5][5] += ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    double ld0 = 991.7442992321639;
    ld0 *= -1;
    double ld1 = 774.9874571239257;
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld0);
}
    Thought lo2 = Thought75.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
    ld1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > ld1;
        fb1 = fb0 && fb1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
    boolean lb3 = true;
    Output.points[5][6] -= fd1;
    double ld4 = 548.5776075361251;
    Thought lo5 = Thought75.getInstance();
if(fo1 != null){
      fo1.m1(ld0, ld1, ld4, fd0, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb6 = false;
    double ld7 = 263.5302031856273;
    fd0 *= -1;
    double ld8 = 333.92150953874625;
    fb0 = fb1 && lb3;

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
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Output.points[5][7] += fd1;
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    boolean lb4 = false;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        lb3 = !lb4;
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        ab4 = fd1 < fd0;
        Output.points[5][8] += fd1;
        fb0 = fb1 || lb0;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, lb4, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        lb0 = lb1 && lb3;
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
    Output.points[6][0] -= ad1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    lb1 = fd1 > ad1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    ad4 = fd0 - fd1;
    lb0 = lb1 || fb0;
    Output.points[6][1] += ad1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
    ad3 = ad4 + fd0;
    double ld2 = 264.5958228489603;

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
    boolean lb0 = true;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      ab1 = fo0.m2(fd1, ad1, ad2, ad3);
}
    ab2 = !ab3;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    double ld2 = 820.5679799920217;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[6][2] -= fd0;
    fb0 = fd1 > fd0;
    double ld1 = 684.0618179032792;
    boolean lb2 = true;

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
    Thought lo0 = Thought69.getInstance(ao1, ao2, ao3, ao4);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought36.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    Output.points[6][3] += fd1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      ad1 = fo0.m3(lb3, fb0, fb1, lb2);
}
    lb3 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4();
}
        boolean lb4 = true;
        ad4 = fd0 - fd1;
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
    Output.points[6][4] -= fd0;
    double ld0 = 85.42450546296638;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought93.getInstance(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
    fd1 = ld0 + fd0;
    Thought lo2 = Thought63.getInstance(ao1, ao2, ao3, ao4);
    Output.points[6][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought66.getInstance(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
if(ao3 != null){
      ab4 = ao3.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    double ld4 = 754.9793163992514;
    double ld5 = 670.3399539248219;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld5, fd0, fd1, ld0);
}
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ld4 < ld5;
    Output.points[6][6] -= fd0;
    fd1 = ld0 + ld4;
    boolean lb6 = true;
    lb6 = ab1 && ab2;
    ld5 = fd0 + fd1;
    ab3 = !ab4;
    fb0 = fb1 || lb6;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ld0 < ld4;
    ld5 = fd0 + fd1;

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
    ab1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    ab1 = ad3 < ad4;
    double ld0 = 255.54238492390192;
    boolean lb1 = false;
    ab1 = !ab2;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + ld0;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought14.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
    lb1 = !ab1;
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
    lb1 = lb3 || ab1;
    boolean lb4 = true;

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
        fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 *= -1;
if(fo1 != null){
          fo1.m3();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
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
    double ld0 = 561.0186232668708;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    double ld2 = 841.2078127930419;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1);
}
    ld0 = ld2 + fd0;
    fd1 = ld0 + ld2;
    boolean lb3 = false;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, lb3, fb0);
}
    double ld4 = 438.9591734222421;
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb1 = !lb3;
    Output.points[6][7] -= ld4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld2, ld4, fb0, fb1, lb1, lb3);
}
    Thought lo5 = Thought64.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, lb3, fb0, fb1, lb1);
}
    double ld6 = 502.46582941501816;
    ld4 = ld6 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb1);
}
    lb3 = fd1 < ld0;
    fb0 = fb1 && lb1;
    Output.points[6][8] -= ld2;

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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought9.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    lb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fb1 = lb1 && fb0;
        fb1 = lb1 || fb0;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
        double ld2 = 257.44213682122586;
    fb0 = fd0 > fd1;
    ld2 = fd0 + fd1;

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
