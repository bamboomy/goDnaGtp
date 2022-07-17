package genetic;
import java.util.ArrayList;
class Thought8 extends Thought{
private static ArrayList<Thought8> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 28.03340455585056;
private double fd1 = 412.04455629802595;
private Thought fo0 = null;
private Thought fo1 = null;
Thought8 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought8 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought8 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought8 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought8 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    double ld1 = 59.963778514204265;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[3][0] -= ld1;
    fd0 *= -1;
        fd1 = ld1 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    double ld2 = 542.403926531765;
    double ld3 = 222.84164021483483;
    boolean lb4 = false;
    ld3 *= -1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb0, lb4, fb0, fb1);
}
    lb0 = lb4 && fb0;
    double ld5 = 165.01304603885714;
    fb1 = lb0 || lb4;
    ld3 = ld5 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, lb4);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        } else if (ab2) {
        ab3 = ab4 || fb0;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = !ab1;
        ab2 = !ab3;
        ab4 = fd1 < fd0;
        fb0 = fb1 || ab1;
        boolean lb0 = false;
        fd1 *= -1;
        Thought lo1 = Thought140.getInstance(fd0, fd1, fd0, fd1);
        fd0 *= -1;
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = ad1 < ad2;
    fb0 = ad3 < ad4;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought287.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought2.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2();
}
    ad3 = ad4 + fd0;
    double ld3 = 76.73223593904338;
    double ld4 = 326.2910337337063;

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
    ab2 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought233.getInstance(ab1, ab2, ab3, ab4);
    Thought lo1 = Thought302.getInstance(fo1, fo0, fo1, fo0);
    ad3 = ad4 + fd0;
    fd1 *= -1;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[3][1] -= fd1;

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
    fd0 = fd1 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    double ld0 = 825.647905487222;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 66.32927261985114;
    if (fb1) {
if(ao2 != null){
          ao2.m1(ld0, ld1, fd0, fd1);
}
        } else {
        fb0 = fb1 || fb0;
        Thought lo2 = Thought38.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
        fb1 = !fb0;
        fb1 = fb0 && fb1;
        fb0 = ld0 < ld1;
        double ld3 = 648.2908550462417;
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 72.77793943822978;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought42.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    ad4 *= -1;
    lb2 = fd0 > fd1;
    fb0 = fb1 && lb2;
    fb0 = ld0 < ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb3 = true;
    ad2 *= -1;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
    ad1 = ad2 - ad3;
    boolean lb4 = false;
    boolean lb5 = true;
    boolean lb6 = true;
    Thought lo7 = Thought331.getInstance(lb4, lb5, lb6, fb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 - fd1;
    ld0 = ad1 + ad2;

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
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought398.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld1 = 591.1716925501061;
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
    fb1 = !ab1;
    ab2 = fd0 < fd1;
    ab3 = ld1 < fd0;
    double ld2 = 723.8294461893357;
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;

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
    double ld0 = 369.1346006455897;
    ld0 *= -1;
    Output.points[3][2] += ad1;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought396.getInstance();
    fb0 = fb1 || ab1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 = ad1 - ad2;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
    ab4 = ld0 < ad1;
    double ld2 = 877.8292345522668;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        Thought lo4 = Thought314.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        ab4 = fd0 > fd1;
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
    double ld3 = 669.950777317954;
    lb0 = fd0 > fd1;
    ld3 *= -1;
    boolean lb4 = true;
    Thought lo5 = Thought223.getInstance();
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb1, lb2, lb4, fb0);
}
    fd0 = fd1 + ld3;
if(fo1 != null){
      fo1.m3(fb1, lb0, lb1, lb2);
}
    lb4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    ld3 = fd0 - fd1;
if(fo0 != null){
      lb1 = fo0.m2(ld3, fd0, fd1, ld3);
}

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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought337.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        boolean lb1 = false;
    ab1 = fd0 < fd1;
    boolean lb2 = true;
    fd0 *= -1;
    ab1 = !ab2;
    double ld3 = 100.65268925085286;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld3, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 834.7489748701416;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld1 = 194.284335589952;
    fb1 = fb0 && fb1;
    fb0 = ld0 < ld1;
if(fo0 != null){
      fo0.m3();
}
    ad1 = ad2 + ad3;
    Output.points[3][3] += ad4;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought396.getInstance(fb0, fb1, fb0, fb1);
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, ad1, ad2, ad3);
}
    Thought lo3 = Thought169.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
    fb0 = ld1 > ad1;
    fb1 = ad2 < ad3;
    fb0 = ad4 < fd0;
    Output.points[3][4] += fd1;
    ld0 = ld1 - ad1;
    Thought lo4 = Thought19.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    fd0 = fd1 - ad1;
    double ld0 = 455.5592170227397;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[3][5] -= ad1;
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    double ld2 = 191.29559612962458;
    ab4 = fb0 && fb1;
    Thought lo3 = Thought184.getInstance(lb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought182.getInstance(ad4, fd0, fd1, ld0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
    boolean lb5 = true;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ld2, ab3, ab4, fb0, fb1);
}
    boolean lb6 = false;

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
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    double ld0 = 8.643848603194357;
    Thought lo1 = Thought155.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb2, fb0);
}
    fd1 = ld0 + fd0;
    fb1 = !lb2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld3 = 185.84192261734063;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld3);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld3, fd0);
}
    boolean lb4 = false;
    fd1 *= -1;
    double ld5 = 33.546540291739944;
    boolean lb6 = false;
    double ld7 = 725.122128497121;
    lb4 = !lb6;
if(ao2 != null){
      fb0 = ao2.m2(ld0, ld3, ld5, ld7, fb1, lb2, lb4, lb6);
}
    fd0 = fd1 + ld0;
    ld3 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m1(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 668.6876088604123;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb2);
}
    fb0 = ld1 > ad1;
    fb1 = lb0 && lb2;

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
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought343.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      fd0 = ao2.m3(ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    ab2 = !ab3;
    boolean lb1 = false;
    ab3 = !ab4;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && ab1;
    ad4 *= -1;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = ad2 > ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    double ld0 = 113.81917712004045;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
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
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought129.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought392.getInstance();
    fb1 = fd0 < fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    double ld2 = 474.84096512239864;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ld2 = fd0 - fd1;
    double ld3 = 115.61779583271135;
    ab4 = fb0 || fb1;
    ld2 *= -1;
    lb1 = !ab1;
    ab2 = ld3 < fd0;
    boolean lb4 = false;
    boolean lb5 = true;
    ab1 = ab2 || ab3;
    ab4 = fd1 < ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
return ld3;
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
    boolean lb0 = false;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = ad1 + ad2;
    lb0 = !fb0;
if(fo1 != null){
      ad3 = fo1.m3(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    lb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
    lb0 = !lb1;
    lb2 = fb0 || fb1;
    ad4 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
}
    fb1 = lb0 || lb1;
if(fo1 != null){
      lb2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(lb2, fb0, fb1, lb0);
}
    double ld3 = 382.01677784116356;

Thought.STACK_COUNTER++;
return ld3;
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
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    ab3 = fd1 < ad1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab3 = fd1 < ad1;
    boolean lb1 = true;
    Output.points[3][6] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
}
    if (ab3) {
        ab4 = ad1 < ad2;
        boolean lb2 = false;
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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 384.00374963618003;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    lb1 = fb0 && fb1;
    double ld2 = 51.426247713591906;
    ld2 *= -1;
    lb1 = fd0 > fd1;
    double ld3 = 302.6667893489186;
    boolean lb4 = true;
    if (lb4) {
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb1, lb4);
}
        ld0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        ld2 = ld3 - fd0;
        Output.points[3][7] -= fd1;
if(fo0 != null){
          fo0.m1(ld0, ld2, ld3, fd0);
}
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld2, ld3, fd0);
}
        Output.points[3][8] += fd1;
        boolean lb5 = true;
        Thought lo6 = Thought51.getInstance(ld0, ld2, ld3, fd0, lb4, fb0, fb1, lb5);
        fd1 = ld0 + ld2;
}
Thought.STACK_COUNTER++;
return ld3;
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
    fb1 = fb0 && fb1;
    ad2 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Output.points[4][0] -= ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    double ld0 = 15.230196861567194;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
    Output.points[4][1] -= fd0;
if(ao2 != null){
      ao2.m1(fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < ld0;
    lb1 = !fb0;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad4 = fd0 + fd1;
    fb1 = ld0 > ad1;
    Thought lo2 = Thought78.getInstance(ad2, ad3, ad4, fd0);

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
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    lb0 = ab1 || ab2;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[4][2] += fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fb0 = fb1 || lb0;

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
        ad1 = ad2 - ad3;
    Output.points[4][3] += ad4;
    boolean lb0 = true;
    Thought lo1 = Thought180.getInstance();
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ad4 = ao1.m3(fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = ad2 < ad3;
    boolean lb2 = true;

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
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4();
}
            if (fb0) {
if(fo0 != null){
                  fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
                  fo1.m1(fb1, fb0, fb1, fb0);
}
                boolean lb0 = false;
if(fo0 != null){
                  fo0.m1(fo1, fo0, fo1, fo0);
}
                fd0 = fd1 - fd0;
                fd1 = fd0 - fd1;
                boolean lb1 = false;
                lb1 = fb0 && fb1;
                fd0 = fd1 + fd0;
if(fo1 != null){
                  fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
                  fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
                lb0 = !lb1;
                fd0 *= -1;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought134.getInstance(fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    ab1 = fd1 < fd0;
    fd1 *= -1;
    double ld1 = 606.6333407534296;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab2 = fo1.m2(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          ab3 = fo0.m2(fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ld1 = fd0 + fd1;
        boolean lb2 = true;
        Thought lo3 = Thought283.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
        boolean lb4 = false;
        ld1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab4 = !fb0;
        fb1 = lb2 && lb4;
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
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[4][4] += fd0;
    boolean lb0 = false;
    if (lb0) {
if(fo1 != null){
          fo1.m1(fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        double ld1 = 529.7613002271464;
        lb0 = fb0 || fb1;
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
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld0 = 136.31722820898628;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    double ld2 = 15.30528078850125;
if(fo1 != null){
      fo1.m3();
}
        lb1 = ad4 > fd0;
    fd1 *= -1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, ad1, ad2, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
    Output.points[4][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought125.getInstance(ld0, ld2, ad1, ad2);
    fb0 = !fb1;
    ad3 = ad4 + fd0;
    Output.points[4][6] -= fd1;
    boolean lb4 = true;
    double ld5 = 225.99422117132607;
    Thought lo6 = Thought380.getInstance(fo1, fo0, fo1, fo0, ld0, ld2, ld5, ad1);
if(fo1 != null){
      lb1 = fo1.m2(ad2, ad3, ad4, fd0, lb4, ab1, ab2, ab3);
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
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Output.points[4][7] += fd0;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb0 = true;
        for(int i0=0; i0<10; i0++){
            double ld1 = 363.245292445053;
            lb0 = fb0 || fb1;
            Thought lo2 = Thought88.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
            fd1 = ld1 + fd0;
if(ao2 != null){
              ao2.m1(fb0, fb1, lb0, fb0);
}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        boolean lb1 = true;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 906.729447688485;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    ld0 *= -1;
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, lb1, lb2, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
    lb1 = lb2 || ab1;
if(ao2 != null){
      ab2 = ao2.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    double ld3 = 291.9949512539889;
    ab3 = !ab4;
    fb0 = fb1 && lb1;

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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld0 = 294.29900045960284;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    double ld1 = 978.5801666056472;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought86.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld1, ad1, ad2);
}
    ab3 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1);
}
    ab4 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld0, ld1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ad3 < ad4;
    Thought lo3 = Thought269.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);

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
    fd0 = fd1 + fd0;
        fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought324.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought296.getInstance();
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[4][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    double ld2 = 1000.0424246113712;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fd1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
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
    fd0 = fd1 + fd0;
    Output.points[5][0] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
    Thought lo0 = Thought351.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = false;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
