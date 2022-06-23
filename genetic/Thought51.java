package genetic;
import java.util.ArrayList;
class Thought51 extends Thought{
private static ArrayList<Thought51> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 734.254209672697;
private double fd1 = 664.4868037311046;
private Thought fo0 = null;
private Thought fo1 = null;
Thought51 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought51 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought51 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought51 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought51 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought51 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought51 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought51 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought51 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 341.5536086234567;
    ld0 = fd0 - fd1;
    fb0 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3();
}
    ld0 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        Output.points[5][3] += fd0;
        double ld2 = 710.9104681782841;
        fd0 = fd1 + ld2;
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld2);
}
        double ld3 = 42.73435153809254;
        ld3 = ld0 + fd0;
        fd1 = ld2 + ld3;
        double ld4 = 899.3461261565556;
        double ld5 = 12.454331347316705;
if(fo1 != null){
          fo1.m1(fb0, fb1, lb1, fb0);
}
        ld4 = ld5 + ld0;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 151.1575535889621;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fd1 = ld0 + fd0;
    boolean lb1 = true;
    fd1 = ld0 - fd0;
    Output.points[5][4] += fd1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 + ld0;
        fb0 = fb1 && lb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
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
    fb1 = fb0 && fb1;
    double ld0 = 243.92682761813413;
if(fo0 != null){
      fb0 = fo0.m2();
}
        ad1 = ad2 - ad3;
    boolean lb1 = false;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
    fb0 = fb1 && lb1;
    fb0 = !fb1;
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
        fb1 = ad2 < ad3;
        lb1 = ad4 > fd0;
        Output.points[5][5] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
        fb0 = ad4 > fd0;
        fb1 = !lb1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, lb1, fb0);
}
        fb1 = lb1 || fb0;
        boolean lb2 = false;
        fb0 = ad3 < ad4;
        Thought lo3 = Thought60.getInstance(fo1, fo0, fo1, fo0, fb1, lb2, lb1, fb0);
        fb1 = lb2 || lb1;
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[5][6] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb1 = true;
    ab3 = ab4 || fb0;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    fb1 = lb0 && lb1;
    boolean lb2 = true;
    lb2 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo3 = Thought1.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);
}
    ab2 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[5][7] -= fd1;
    lb0 = lb1 && lb2;

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
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought39.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[5][8] -= fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[6][0] += fd0;
    Output.points[6][1] -= fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m1();
}
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
    Thought lo1 = Thought3.getInstance(fb1, lb0, fb0, fb1);
    lb0 = ad4 > fd0;
    fb0 = !fb1;
    Thought lo2 = Thought2.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb3 = false;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Output.points[6][2] -= fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m1();
}
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
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
    boolean lb0 = false;
    lb0 = !ab1;
    ab2 = !ab3;
    boolean lb1 = false;
        ad1 = ad2 + ad3;
    if (ab3) {
        ad4 = fd0 + fd1;
        boolean lb2 = true;
        double ld3 = 864.3285023878462;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        double ld4 = 897.4388890193777;
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
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;

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
    Output.points[6][3] -= fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    double ld0 = 618.8271145958574;
    ab2 = fd0 < fd1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    Output.points[6][4] += fd1;
    ab2 = ld0 > fd0;
    ab3 = ab4 && fb0;
    fd1 = ld0 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought60.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab3 = fd1 < ld0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ld0 - fd0;

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
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
        ad2 *= -1;
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    double ld1 = 294.0843229294924;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    boolean lb3 = false;
    Output.points[6][5] += ad4;
    Thought lo4 = Thought9.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld1, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld1 = fo1.m3();
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    lb2 = lb3 && fb0;
    fb1 = !lb2;

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
        ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ab3 = fd0 > fd1;

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
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        Thought lo0 = Thought91.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        Thought lo1 = Thought53.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
        if (fb1) {
if(ao3 != null){
              fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 315.5331082597265;
    double ld1 = 915.509416040673;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ld0 < ld1;
    double ld2 = 360.16059300050216;
    if (fb0) {
        boolean lb3 = true;
        fb0 = fb1 || lb3;
        boolean lb4 = false;
if(ao4 != null){
          ld2 = ao4.m3(ad1, ad2, ad3, ad4);
}
        boolean lb5 = true;
        fd0 *= -1;
        lb4 = fd1 > ld0;
if(fo0 != null){
          ld1 = fo0.m3(lb5, fb0, fb1, lb3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought21.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought21.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    double ld2 = 621.3809052747262;
    boolean lb3 = false;
    Output.points[6][6] += fd0;
    double ld4 = 718.8780161937202;
    boolean lb5 = true;
    Output.points[6][7] += fd0;
    ab3 = ab4 || fb0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb3, lb5, ab1);
}
    Thought lo6 = Thought89.getInstance(ao3, ao4, fo0, fo1);
    boolean lb7 = false;
    Output.points[6][8] += ld2;
    ld4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, ld4, ab1, ab2, ab3, ab4);
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
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
if(ao1 != null){
      ao1.m2();
}
    ab4 = fb0 || fb1;
    double ld0 = 557.3093764679185;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought31.getInstance(fd1, ld0, ad1, ad2);
    ad3 = ad4 + fd0;
    Output.points[7][0] -= fd1;
    ab1 = ld0 < ad1;
    if (ab2) {
        ad2 *= -1;
if(ao2 != null){
          ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
        Output.points[7][1] -= ad3;
        ab2 = !ab3;
        ab4 = ad4 > fd0;
        double ld2 = 131.1087875780656;
        Output.points[7][2] += fd0;
        boolean lb3 = true;
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
    fd0 *= -1;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    double ld2 = 733.0889026183182;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought5.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    double ld2 = 897.5653637450076;
    Output.points[7][3] += ld2;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo1.m2();
}
    Thought lo3 = Thought18.getInstance(fd0, fd1, ld2, fd0);
    fd1 = ld2 - fd0;
    fb0 = fd1 < ld2;
if(fo0 != null){
      fo0.m2(fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - ld2;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 - fd0;

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
    fb1 = fb0 && fb1;
        ad1 = ad2 + ad3;
    double ld0 = 60.20448747453622;
    double ld1 = 418.0708166327393;
        fb0 = fb1 && fb0;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ld1 = ad1 + ad2;
    if (fb0) {
        } else if (fb1) {
        boolean lb2 = false;
        ad3 *= -1;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
          fo0 = fo1.m4();
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
        double ld0 = 622.2236714698846;
        ab1 = ab2 && ab3;
        ab4 = ld0 < ad1;
        fb0 = ad2 > ad3;
        fb1 = ad4 > fd0;
        fd1 = ld0 + ad1;
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
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
    Output.points[7][4] += fd0;
    Thought lo1 = Thought83.getInstance(ao3, ao4, fo0, fo1);
    fd1 *= -1;
    fd0 *= -1;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    double ld3 = 985.72161482234;
if(ao1 != null){
      ld3 = ao1.m3(fd0, fd1, ld3, fd0, fb0, fb1, lb0, lb2);
}
    fd1 = ld3 + fd0;
    fb0 = fd1 > ld3;
    fb1 = lb0 && lb2;
    double ld4 = 49.18438764919541;
        Output.points[7][5] -= ld4;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m2();
}
    ld3 = ld4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld3, ld4, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought62.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
        fd0 = fd1 - ad1;
    fb1 = !fb0;
    fb1 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        boolean lb1 = false;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
}
        boolean lb2 = true;
        lb1 = !lb2;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        ad2 *= -1;
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
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    double ld0 = 416.88383250937744;
    Output.points[7][6] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    boolean lb1 = false;
    boolean lb2 = true;
    ld0 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    ab3 = !ab4;
    fb0 = !fb1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, ab1, ab2);
}
    ld0 = fd0 - fd1;
    ab3 = ld0 < fd0;
    double ld3 = 900.7205811621369;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld3);
}
    ab4 = fd0 > fd1;

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
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    Output.points[7][7] -= ad3;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    Thought lo1 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    Output.points[7][8] -= fd0;
    fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    double ld3 = 801.3503763378139;
    Thought lo4 = Thought95.getInstance(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
    lb0 = !lb2;
    fb0 = !fb1;
    Output.points[8][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3, lb0, lb2, fb0, fb1);
}
    Thought lo5 = Thought62.getInstance();
    double ld6 = 279.41035084742833;

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
    ab1 = fd1 > fd0;
if(fo1 != null){
      ab2 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought95.getInstance(ab3, ab4, fb0, fb1);
    fd1 = fd0 + fd1;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought20.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = ab1 && ab2;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        if (ab1) {
            fd1 *= -1;
            boolean lb2 = false;
            boolean lb3 = false;
            boolean lb4 = false;
            fd0 = fd1 + fd0;
            lb3 = fd1 < fd0;
            double ld5 = 941.3115594145761;
            lb4 = fd0 > fd1;
if(fo1 != null){
              ld5 = fo1.m3();
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
        boolean lb1 = true;
        double ld2 = 645.7700858612209;
    Thought lo3 = Thought70.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
    Thought lo4 = Thought66.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
    lb1 = fb0 || fb1;
    boolean lb5 = true;
    lb0 = !lb1;
    lb5 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb5);
}
    fd1 = ld2 - ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[8][1] -= ad2;
        ad3 *= -1;
        for(int i1=0; i1<10; i1++){
            fb0 = ad4 > fd0;
if(fo1 != null){
              fb1 = fo1.m2(fd1, ld2, ad1, ad2, lb0, lb1, lb5, fb0);
}
            Output.points[8][2] += ad3;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought69.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    ab1 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(ab2, ab3, ab4, fb0);
}
        Output.points[8][3] -= ad3;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
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
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    lb1 = fd1 > fd0;
    boolean lb2 = true;
    Output.points[8][4] += fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    boolean lb3 = false;
    fd0 *= -1;

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
    ad2 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3();
}
    fb1 = ad1 < ad2;
    Thought lo0 = Thought81.getInstance(ad3, ad4, fd0, fd1);
if(ao4 != null){
      ao4.m3(fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    double ld1 = 652.0376208677437;
    Thought lo2 = Thought38.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
    Output.points[8][5] -= fd0;

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
    double ld0 = 403.61948959729654;
    ab1 = ld0 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Thought lo1 = Thought64.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    ld0 = fd0 + fd1;
    ld0 *= -1;
    ab1 = ab2 && ab3;
    boolean lb2 = false;
    double ld3 = 559.9932286512595;
    Output.points[8][6] += ld3;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ab4 = fd0 < fd1;
    fb0 = fb1 || lb2;
    ab1 = ld0 < ld3;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld0, ld3, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought23.getInstance();

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
if(ao2 != null){
      ab1 = ao2.m2(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 || ab4;
    double ld0 = 783.7779974565075;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2);
}
    Output.points[8][7] -= ad3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    fb0 = fb1 || lb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought92.getInstance(ao4, fo0, fo1, ao1);
    Output.points[8][8] += ad3;
    if (fb0) {
        Thought lo3 = Thought30.getInstance(ad4, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
if(ao2 != null){
          ad1 = ao2.m3();
}
        ab3 = ab4 && fb0;
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
        fd1 = ld0 + ad1;
if(fo0 != null){
          fb1 = fo0.m2(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
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
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought13.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought43.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought78.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld3 = 54.94134474847198;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ld3 *= -1;
        fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    Output.points[0][0] -= fd0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 126.77276644273671;
        ld0 *= -1;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought94.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    fd1 *= -1;
    fb0 = ld0 < fd0;
    fd1 = ld0 - fd0;
    Output.points[0][1] += fd1;
    fb1 = !lb2;
    fb0 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
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
    fb0 = fd0 < fd1;
    double ld0 = 249.07890278790572;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    fb0 = ld0 > fd0;
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb3, lb4, fb0, fb1);
}
    double ld5 = 875.8102278321699;
    lb2 = lb3 || lb4;
    fb0 = ld0 > ld5;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, lb3, lb4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ld0, ld5, fd0, fd1, fb1, lb2, lb3, lb4);
}
    ld0 *= -1;
    ld5 *= -1;

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
