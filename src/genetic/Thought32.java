package genetic;
import java.util.ArrayList;
class Thought32 extends Thought{
private static ArrayList<Thought32> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 150.9642277104804;
private double fd1 = 303.12386359025317;
private Thought fo0 = null;
private Thought fo1 = null;
Thought32 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought32 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought32 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought32 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought32 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought32 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought32 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought32 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought32 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    double ld0 = 903.8736679079559;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    ld0 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, fb0);
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
    fd0 = fd1 - fd0;
        boolean lb0 = false;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = false;

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
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = !fb0;
    double ld2 = 284.5084747285935;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, lb1, fb0);
}
    fb1 = fd1 < ld2;
    lb0 = lb1 || fb0;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
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
    ab2 = !ab3;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ad3 = ad4 - fd0;
    ab2 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought38.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ab1 = ab2 || ab3;
    double ld1 = 11.87718637259113;
    if (ab4) {
        boolean lb2 = true;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(ab4, fb0, fb1, lb2);
}
        for(int i0=0; i0<10; i0++){
            ab1 = ld1 > ad1;
            ab2 = ab3 || ab4;
if(fo1 != null){
              fo0 = fo1.m4();
}
            fb0 = ad2 < ad3;
}}
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
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 310.9105961969477;
    fb0 = ld0 < fd0;
    Thought lo1 = Thought46.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought71.getInstance(ld0, fd0, fd1, ld0);
    fb0 = fd0 < fd1;
    Thought lo3 = Thought11.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
    boolean lb4 = true;
    Thought lo5 = Thought85.getInstance(fb0, fb1, lb4, fb0);
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, lb4, fb0, fb1, lb4);
}
    fd0 = fd1 + ld0;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, lb6, fb0, fb1, lb4);
}
    boolean lb7 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb6, lb7, fb0, fb1);
}
    Thought lo8 = Thought31.getInstance(fd1, ld0, fd0, fd1);
    ld0 *= -1;
    fd0 = fd1 + ld0;
    lb4 = lb6 || lb7;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, fb0);
}
    ad3 = ad4 + fd0;
    boolean lb1 = false;
    Thought lo2 = Thought75.getInstance();
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    boolean lb3 = true;

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
    Output.points[6][3] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought16.getInstance(fd0, fd1, fd0, fd1);
    ab3 = ab4 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    boolean lb1 = false;

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
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    double ld0 = 131.25020143982763;
    fb1 = !ab1;
    ab2 = ld0 > ad1;
    Output.points[6][4] -= ad2;
    ad3 = ad4 + fd0;
    ab3 = ab4 || fb0;
    double ld1 = 336.41434656515935;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4();
}
            ld1 = ad1 + ad2;
    fb1 = !ab1;
    ab2 = !ab3;
    ab4 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = ld0 < ld1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    double ld2 = 884.4659218942307;

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
    Output.points[6][5] -= fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[6][6] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[6][7] -= fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld2 = 980.8942116763276;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought30.getInstance(fd1, ld2, fd0, fd1);
    fb0 = fb1 && lb0;
    lb1 = ld2 > fd0;
    fb0 = fd1 > ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m2();
}
    ld2 = fd0 - fd1;

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
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[6][8] -= fd1;
    boolean lb1 = true;
    Thought lo2 = Thought48.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    lb1 = fd0 > fd1;
    double ld3 = 349.14746843025085;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = ld3 < fd0;
        Thought lo4 = Thought69.getInstance(fd1, ld3, fd0, fd1);
if(fo1 != null){
          ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
        fb1 = lb0 || lb1;
        double ld5 = 140.18415231775293;
        if (ab1) {
            ab2 = fd0 > fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        Thought lo0 = Thought96.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        }
    Output.points[7][0] -= ad1;
    boolean lb1 = false;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought49.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m2(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
        Thought lo3 = Thought14.getInstance(fo1, fo0, fo1, fo0);

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought19.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    boolean lb1 = false;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 > ad4;
if(fo1 != null){
          fo1.m1(fd0, fd1, ad1, ad2);
}
        Thought lo2 = Thought39.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, ab1, ab2);
}
        boolean lb3 = false;
        double ld4 = 477.6271142810598;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          ld4 = fo1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
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
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    Output.points[7][1] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    double ld0 = 722.686475887439;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought97.getInstance(ld0, fd0, fd1, ld0);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    fb0 = ld0 > fd0;
    fd1 = ld0 - fd0;
    Output.points[7][2] += fd1;
        ld0 *= -1;
    boolean lb2 = true;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;

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
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao4.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    boolean lb0 = false;
        boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
    double ld2 = 916.1993355119909;
    ad2 *= -1;

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
        fd1 *= -1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 401.465246213503;
    double ld1 = 650.6628665189945;
    ab2 = !ab3;
    Thought lo2 = Thought85.getInstance(ao2, ao3, ao4, fo0, ld0, ld1, fd0, fd1);
    boolean lb3 = false;
    boolean lb4 = true;
    ab2 = !ab3;
    ld0 *= -1;
    ab4 = ld1 > fd0;

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
if(ao2 != null){
      ad2 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ad3 = ad4 - fd0;
    ab3 = !ab4;
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    double ld1 = 407.5884522471768;
if(ao3 != null){
      ab4 = ao3.m2();
}
    fb0 = ad2 > ad3;
if(ao4 != null){
      fb1 = ao4.m2(ad4, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    boolean lb2 = true;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought58.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    Output.points[7][3] += fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    Output.points[7][4] -= fd1;
    lb1 = fd0 > fd1;

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
    boolean lb0 = false;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[7][5] += fd1;
    if (ab1) {
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m1();
}
        Output.points[7][6] -= fd1;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
        fd0 = fd1 + fd0;
        ab3 = ab4 && fb0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        Output.points[7][7] += fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1);
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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < ad1;
        Thought lo0 = Thought1.getInstance();
        boolean lb1 = false;
        Thought lo2 = Thought98.getInstance(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        }
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    lb0 = ad2 < ad3;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo2 = Thought34.getInstance(lb0, lb1, ab1, ab2);
if(fo1 != null){
      fo1.m1();
}
    ab3 = ab4 && fb0;
    fb1 = lb0 && lb1;
    ab1 = ad2 < ad3;
    boolean lb3 = true;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    double ld1 = 538.6238847312827;
    Output.points[7][8] -= fd0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ld1 = fd0 + fd1;
    Thought lo2 = Thought36.getInstance(ld1, fd0, fd1, ld1);
    Thought lo3 = Thought44.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
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
    fb0 = ad1 > ad2;
if(ao2 != null){
      ad3 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Output.points[8][0] += ad2;
    Thought lo0 = Thought91.getInstance(fo0, fo1, ao1, ao2);
    fb1 = !fb0;
    double ld1 = 940.2155665280429;
    ad2 = ad3 + ad4;
    double ld2 = 704.8138063147222;
    fb1 = ad4 < fd0;
    fb0 = fd1 > ld1;
    Output.points[8][1] += ld2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
    Thought lo0 = Thought46.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    boolean lb1 = true;
    lb1 = fd1 < fd0;
    ab1 = ab2 || ab3;
    fd1 *= -1;
    double ld2 = 393.08503558206024;
    ld2 = fd0 + fd1;
    ab4 = ld2 > fd0;
    boolean lb3 = true;
    ab4 = fd1 > ld2;
    double ld4 = 409.5552471708918;
    fb0 = ld4 < fd0;
    fd1 = ld2 - ld4;

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
if(ao1 != null){
      ao1.m3(ab2, ab3, ab4, fb0);
}
    Output.points[8][2] -= ad2;
    boolean lb0 = true;
if(ao2 != null){
      fb0 = ao2.m2();
}
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        Output.points[8][3] += ad4;
        fb1 = fd0 > fd1;
        Thought lo1 = Thought24.getInstance(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
        fd0 = fd1 - ad1;
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Thought lo1 = Thought53.getInstance(fd0, fd1, fd0, fd1);
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb4 = true;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb3, lb4, lb5, fb0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;

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
    double ld0 = 646.7753916893892;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    boolean lb2 = true;
    Thought lo3 = Thought42.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, lb2, ab1, ab2);
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought42.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
    lb1 = !lb2;
    boolean lb5 = false;
    fd0 = fd1 + ld0;
    Thought lo6 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    lb5 = ab1 && ab2;
    Output.points[8][4] += fd1;
    ab3 = ld0 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb1);
}
    lb2 = !lb5;
    ld0 = fd0 - fd1;
    ab1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    Thought lo7 = Thought88.getInstance();
    Thought lo8 = Thought64.getInstance(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = lb1 && lb2;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought12.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    if (lb0) {
        fd0 *= -1;
        fb0 = fd1 < ad1;
        boolean lb2 = true;
        Thought lo3 = Thought75.getInstance(ad2, ad3, ad4, fd0);
        double ld4 = 540.8922227639783;
        Thought lo5 = Thought96.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ad1);
        fb0 = ad2 > ad3;
if(fo0 != null){
          fo0.m1(fb1, lb2, lb0, fb0);
}
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
      ab1 = fo0.m2();
}
    Output.points[8][5] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 370.4370919330236;
    fb1 = ab1 || ab2;
    ld0 = ad1 + ad2;
    double ld1 = 982.0358433987136;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
    fd1 *= -1;
    fb0 = fb1 && ab1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb1 = lb2 || ab1;
    ab2 = ld1 < ad1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought21.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Output.points[8][6] += fd0;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought1.getInstance(fd0, fd1, fd0, fd1);
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo0.m1();
}
    double ld3 = 713.5967192210805;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld3, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = ld3 > fd0;
    lb2 = fb0 && fb1;
    lb2 = fd1 > ld3;
    fb0 = fb1 || lb2;
    boolean lb4 = false;
    lb4 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld3, fd0, fd1, lb2, lb4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
    fb1 = fb0 || fb1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    double ld0 = 901.9959103666139;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m1(fb0, fb1, lb1, fb0);
}
if(ao2 != null){
          ao2.m1();
}
        fb1 = ad1 < ad2;
if(ao3 != null){
          ad3 = ao3.m3(ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld0 = 160.90594518975365;
    ld0 = fd0 + fd1;
    double ld1 = 963.2972109394441;
    boolean lb2 = true;
    double ld3 = 870.2059440994346;
    ld0 = ld1 + ld3;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb2, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ld0, ld1, ld3, fd0);
}
    boolean lb4 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ld3);
}
    boolean lb5 = true;
    Output.points[8][7] -= fd0;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    fd1 = ld0 - ld1;
    ld3 = fd0 + fd1;
if(ao3 != null){
      ld0 = ao3.m3();
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
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && ab1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
        boolean lb0 = false;
        Thought lo1 = Thought33.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
        double ld2 = 21.381209805787343;
        Thought lo3 = Thought10.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
        ab2 = ab3 && ab4;
        boolean lb4 = true;
}
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
    double ld0 = 685.286899169085;
    Thought lo1 = Thought85.getInstance(ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2();
}
    fb0 = fd0 < fd1;
    boolean lb3 = false;
    Thought lo4 = Thought81.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb2;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb3, fb0, fb1, lb2);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[8][8] -= fd1;
    fd0 *= -1;
    Thought lo1 = Thought98.getInstance();
    double ld2 = 562.3685382304591;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought63.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Thought lo1 = Thought59.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    double ld2 = 211.10652480419637;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = ld2 > fd0;
    lb3 = fd1 > ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld2, fd0);
}
        boolean lb4 = true;
    Thought lo5 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(lb3, lb4, fb0, fb1);
}
    lb3 = lb4 || fb0;
    ld2 *= -1;
    Thought lo6 = Thought95.getInstance();
    Thought lo7 = Thought69.getInstance(fd0, fd1, ld2, fd0, fb1, lb3, lb4, fb0);

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
