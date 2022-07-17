package genetic;
import java.util.ArrayList;
class Thought75 extends Thought{
private static ArrayList<Thought75> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 824.229397309036;
private double fd1 = 277.37355340576937;
private Thought fo0 = null;
private Thought fo1 = null;
Thought75 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought75 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought75 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought75 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought75 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 349.73029381138997;
if(fo1 != null){
      fo1.m2();
}
        double ld1 = 570.2963741266608;
    Thought lo2 = Thought63.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb3 = false;
    Thought lo4 = Thought220.getInstance(fb0, fb1, lb3, fb0);
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ld0 = ld1 - fd0;
        boolean lb5 = true;
        lb5 = fd1 > ld0;
        lb3 = fb0 && fb1;
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld0, ld1);
}
        fd0 = fd1 - ld0;
        double ld6 = 71.50107546443417;
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
    ab1 = fd1 > fd0;
    double ld0 = 742.7837825553104;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    ab3 = ab4 || fb0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    Thought lo1 = Thought10.getInstance(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb2 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    lb2 = !ab1;
    boolean lb3 = true;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb4, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && lb2;
    Thought lo5 = Thought318.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    lb3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, lb4, ab1, ab2, ab3);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought49.getInstance();
    fb1 = !fb0;
    Output.points[2][1] += ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought336.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb1 = !lb2;
    fd0 = fd1 - ad1;
    boolean lb3 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb2);
}
    lb3 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
          fo1.m3();
}
    Output.points[2][2] += fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
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
    ab1 = !ab2;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    double ld2 = 48.065351618733324;
if(fo1 != null){
      lb0 = fo1.m2(ld2, ad1, ad2, ad3);
}
    lb1 = !ab1;
    double ld3 = 642.1475874736686;
    ab2 = ab3 && ab4;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ld3, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ld2 *= -1;

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
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3();
}
    boolean lb1 = true;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
        boolean lb3 = true;
    Output.points[2][3] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, lb2, lb3);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb4 = true;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 134.81804358461414;
    ad1 = ad2 + ad3;
    double ld1 = 860.650225013077;
    ad3 *= -1;
    ad4 *= -1;
    double ld2 = 278.117837969968;
    fb1 = ad4 > fd0;
    fd1 *= -1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, ld2, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    boolean lb3 = false;
    fb0 = fd0 < fd1;
    ld0 *= -1;
    fb1 = lb3 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb3, fb0, fb1);
}
    double ld4 = 436.9040829352604;
    double ld5 = 799.0408599034276;
    Output.points[2][4] += ld1;

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
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd1 = fd0 + fd1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
        boolean lb0 = false;
        ab3 = fd1 < fd0;
        fd1 = fd0 + fd1;
        ab4 = fb0 || fb1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb1 = true;
        lb0 = lb1 && ab1;
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0);
}
        Output.points[2][5] -= fd1;
        fd0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought318.getInstance(fb1, lb0, lb1, ab1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        ab2 = fd0 < fd1;
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
    ab1 = ad1 > ad2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
    ab4 = ad3 < ad4;
    boolean lb0 = true;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        fb0 = !fb1;
        Thought lo1 = Thought48.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
        fd0 *= -1;
        lb0 = fd1 < ad1;
if(fo0 != null){
          ab1 = fo0.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
        fd1 = ad1 - ad2;
if(ao1 != null){
          fo1 = ao1.m4();
}
        double ld2 = 546.0001922352163;
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
    double ld0 = 382.11033248927316;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    fb1 = fd1 > ld0;
    boolean lb1 = true;
    fd0 *= -1;
    lb1 = fd1 < ld0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought320.getInstance(fd0, fd1, ld0, fd0);
    double ld3 = 993.4316529925445;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ld3, fd0);
}
    Thought lo4 = Thought260.getInstance(fd1, ld0, ld3, fd0, lb1, fb0, fb1, lb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    ld0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    Thought lo5 = Thought203.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld0);
}
    ld3 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1(ld3, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb1 = fb0 || fb1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
    ab2 = fd0 < fd1;
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    fb0 = ad1 > ad2;
            fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    Output.points[2][6] += fd1;
    ad1 = ad2 - ad3;
    double ld0 = 348.54652001770097;

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
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    Thought lo3 = Thought111.getInstance(ab4, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 308.543821663658;
    Output.points[2][7] -= fd0;
    Output.points[2][8] -= fd1;
if(ao2 != null){
      ao2.m1(ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    Output.points[3][0] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      lb1 = ao3.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;
    double ld3 = 845.2264881263565;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo4 = Thought316.getInstance(fo1, ao1, ao2, ao3, ld0, ld3, fd0, fd1, fb1, lb1, lb2, fb0);
    Thought lo5 = Thought350.getInstance(fb1, lb1, lb2, fb0);
    if (fb1) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ld0 = ao4.m3(ld3, fd0, fd1, ld0);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld0);
}
        lb1 = !lb2;
if(fo0 != null){
          ao4 = fo0.m4(ld3, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
        Output.points[3][1] += ld3;
        double ld6 = 845.8634207169166;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
          fo1.m3();
}
        Thought lo7 = Thought129.getInstance(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld6, fb0, fb1, lb1, lb2);
        fb0 = ld0 < ld3;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, lb2, fb0);
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
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
        fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    ad2 *= -1;
    Output.points[3][2] += ad3;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
    ad4 *= -1;
if(ao3 != null){
      fd0 = ao3.m3();
}
    boolean lb2 = true;
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb1, lb2, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(lb0, lb1, lb2, fb0);
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
    double ld0 = 585.1913378202983;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab4 = ao1.m2(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2();
}
        ab3 = !ab4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab1 = ao3.m2(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld0 = 145.23256635349054;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
if(ao3 != null){
      ao3.m3();
}
    Output.points[3][3] -= fd1;
    fb0 = ld0 > ad1;
    ad2 = ad3 - ad4;
    if (fb1) {
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
        ab4 = ad2 < ad3;
        fb0 = fb1 && lb1;
if(ao3 != null){
          ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb0 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || lb0;
if(fo0 != null){
          fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        Thought lo1 = Thought236.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
        fb0 = fb1 || lb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
if(fo1 != null){
          fd1 = fo1.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 980.389765478761;
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    fb0 = !fb1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    Output.points[3][4] -= fd1;
    double ld1 = 400.3634018807347;
    ab1 = !ab2;
    Output.points[3][5] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    double ld1 = 585.1275586798494;
    ad4 *= -1;
    double ld2 = 904.7162818491735;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      ld1 = fo0.m3();
}
    fb0 = ld2 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        fb0 = fb1 || lb0;
        } else {
        Thought lo3 = Thought336.getInstance(fb0, fb1, lb0, fb0);
        fb1 = lb0 || fb0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld1, ld2, ad1);
}
        boolean lb4 = true;
        fb0 = ad2 < ad3;
        fb1 = ad4 > fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ad3 *= -1;
    ad4 *= -1;
    ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    double ld0 = 291.84312296728297;
    Thought lo1 = Thought236.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    double ld2 = 152.76805735044024;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 147.06063149465632;
    ld0 *= -1;
if(ao1 != null){
      ao1.m1(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    double ld1 = 284.13908554860194;
    ld1 = fd0 + fd1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          fb0 = ao2.m2();
}
        Output.points[3][6] += ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = ld1 > fd0;
        Output.points[3][7] -= fd1;
if(ao3 != null){
          fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld1 = 107.52708011542283;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought78.getInstance(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
    Output.points[3][8] += ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 603.3761331345478;
    boolean lb1 = true;
    fd0 *= -1;
    ab4 = fb0 || fb1;
    fd1 = ld0 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ab4 = !fb0;
if(ao2 != null){
      ao2.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 > ld0;
    boolean lb2 = true;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1, lb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Thought lo3 = Thought343.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, lb2, ab1);
    ab2 = ab3 || ab4;
    if (fb0) {
        fb1 = lb1 || lb2;
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        } else {
}
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
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m1();
}
    fb0 = fb1 || ab1;
    ad2 = ad3 - ad4;
    double ld0 = 825.7846090258228;
    boolean lb1 = false;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab2 = ab3 || ab4;
    fb0 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ld0);
}
        ad1 = ad2 + ad3;
        fb1 = ad4 > fd0;
if(fo1 != null){
          lb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        ld0 *= -1;
        boolean lb2 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
        boolean lb3 = true;
        double ld4 = 829.1038036522389;
        }
    ad1 *= -1;
if(ao1 != null){
      ao1.m1();
}
    ad2 = ad3 + ad4;
    Output.points[4][0] -= fd0;

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
    if (fb1) {
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        if (fb0) {
if(fo0 != null){
              fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
            Output.points[4][1] -= fd0;
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
            fd1 = fd0 + fd1;
            } else if (fb0) {
            Thought lo0 = Thought167.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
            double ld1 = 28.0036400375554;
            fb1 = fb0 && fb1;
            Output.points[4][2] += ld1;
            fd0 = fd1 + ld1;
            if (fb0) {
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
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
if(fo0 != null){
          fd0 = fo0.m3();
}
    boolean lb1 = true;
    Thought lo2 = Thought336.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
    boolean lb3 = true;

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
    double ld0 = 742.5971681875432;
if(fo0 != null){
      ad1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Output.points[4][3] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = fb0 && fb1;
    ad3 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ld0);
}
    Output.points[4][4] -= ad1;
    ad2 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Output.points[4][5] -= ad4;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    Output.points[4][6] -= ld0;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
        ad2 *= -1;
    Output.points[4][7] += ad3;
    ad4 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought278.getInstance(fb1, lb1, fb0, fb1);

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
    Output.points[4][8] -= ad1;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = ad2 < ad3;
        fb0 = ad4 < fd0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        }
    fd0 *= -1;
    Thought lo0 = Thought154.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    ab1 = ad4 > fd0;
    Thought lo1 = Thought96.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    boolean lb2 = false;
    boolean lb3 = true;
    fd1 = ad1 - ad2;
    double ld4 = 177.119900793293;
    lb3 = ad2 > ad3;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1();
}
    lb5 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld4, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;
    double ld6 = 829.3705266214574;

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
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    Thought lo0 = Thought217.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    fd0 *= -1;
    Thought lo2 = Thought255.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    boolean lb3 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(lb3, lb4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought315.getInstance(ao1, ao2, ao3, ao4);
    ad2 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    Output.points[5][0] -= ad1;
    ad2 *= -1;
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
    Output.points[5][1] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fd0 *= -1;
    fb0 = fd1 > ad1;
        ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(ao3 != null){
      ad3 = ao3.m3(fb1, lb1, fb0, fb1);
}
    lb1 = ad4 > fd0;
    fd1 = ad1 - ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
    boolean lb1 = true;
if(ao1 != null){
      ab3 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb2 = true;
    ab3 = fd1 < fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab4 = fb0 || fb1;
    boolean lb3 = true;
    lb0 = lb1 && lb2;
    boolean lb4 = false;
    fd0 = fd1 - fd0;
    lb3 = fd1 < fd0;
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
    Output.points[5][2] += fd0;
    boolean lb6 = true;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[5][3] -= fd1;
    Thought lo0 = Thought159.getInstance(fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought195.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    Thought lo2 = Thought254.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + ad1;
    ab4 = !fb0;
    fb1 = ad2 > ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
    double ld3 = 299.8395427326029;
    ad1 = ad2 - ad3;
    ab1 = !ab2;
    boolean lb4 = true;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[5][4] += fd0;
    Output.points[5][5] -= fd1;
    Output.points[5][6] -= fd0;
    fd1 *= -1;
    Output.points[5][7] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
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
        double ld0 = 798.5441235472379;
    fb0 = fb1 || fb0;
        ld0 = fd0 + fd1;
    double ld1 = 52.02084481796918;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought354.getInstance(fb1, lb2, fb0, fb1);
    ld0 = ld1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, fd0);
}
    lb2 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    fb0 = fb1 && lb2;
    fb0 = !fb1;
    lb2 = fb0 || fb1;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    double ld4 = 597.1364034599042;
    double ld5 = 314.7630763548607;
    ld1 = ld4 - ld5;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[5][8] += fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
