package genetic;
import java.util.ArrayList;
class Thought23 extends Thought{
private static ArrayList<Thought23> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 551.1520491990277;
private double fd1 = 656.177123685354;
private Thought fo0 = null;
private Thought fo1 = null;
Thought23 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought23 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought23 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought23 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought23 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[0][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    double ld0 = 547.0150145043798;
    fb1 = fb0 || fb1;
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    lb1 = ld0 > fd0;
    fd1 = ld0 + fd0;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 691.5204715698346;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1();
}
    double ld1 = 756.5434998629745;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ld0 = ld1 + fd0;
    boolean lb2 = true;
    boolean lb3 = true;
    fd1 *= -1;
    ab2 = ld0 < ld1;
    boolean lb4 = true;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = ld1 - fd0;

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
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb0, lb1);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    lb0 = fd1 > ad1;
    lb1 = ad2 > ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld3 = 619.0223897794895;

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
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        ad3 *= -1;
        ad4 = fd0 + fd1;
        fb0 = !fb1;
        double ld0 = 18.84237645355417;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld0 = ad1 - ad2;
        Thought lo1 = Thought101.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
          fo0.m2(ab3, ab4, fb0, fb1);
}
        if (ab1) {
            ab2 = ld0 > ad1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            boolean lb2 = false;
            ad2 = ad3 - ad4;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
            ad2 *= -1;
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
    double ld0 = 994.3705705178505;
        fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = ld0 < fd0;
    fb0 = !fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
        fb1 = fb0 && fb1;
    boolean lb1 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(ao3 != null){
      lb2 = ao3.m2(fb0, fb1, lb1, lb2);
}
    boolean lb3 = true;
    lb3 = ld0 > fd0;
    boolean lb4 = true;

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
    double ld0 = 680.0377277615576;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[0][3] -= ad1;
    fb1 = ad2 > ad3;
    Output.points[0][4] += ad4;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld0, ad1);
}
    fb1 = ad2 > ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb1 = false;
    lb1 = !fb0;
    ad1 *= -1;
    fb1 = ad2 < ad3;
    Output.points[0][5] -= ad4;
    Thought lo2 = Thought140.getInstance(fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld3 = 945.5827683803722;
    Thought lo4 = Thought292.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld3, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    Thought lo5 = Thought308.getInstance(fd1, ld0, ld3, ad1);

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
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab4 = fd0 < fd1;
    Thought lo0 = Thought113.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Thought lo1 = Thought273.getInstance();
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab2 = !ab3;
    fd1 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought389.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    lb2 = ab1 && ab2;
    double ld4 = 703.1688570619128;
    ab3 = ld4 > fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        if (ab4) {
            boolean lb5 = true;
            ab4 = !fb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = ad1 > ad2;
    double ld0 = 320.9063678427399;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought320.getInstance(fb0, fb1, ab1, ab2);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought285.getInstance(ad2, ad3, ad4, fd0);
    ab3 = fd1 > ld0;
    ab4 = ad1 > ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb3 = false;
    Thought lo4 = Thought354.getInstance(ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb3);
    Thought lo5 = Thought378.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
    Thought lo6 = Thought264.getInstance();
    fb0 = !fb1;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, lb3, ab1, ab2, ab3);
}
    boolean lb7 = false;
    ab3 = ab4 || fb0;
    ad4 = fd0 + fd1;
if(ao3 != null){
      fb1 = ao3.m2(lb3, lb7, ab1, ab2);
}
        ab3 = !ab4;
    fb0 = ld0 < ad1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    lb3 = lb7 && ab1;

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
    Thought lo0 = Thought31.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, lb2, fb0);
}
    fd1 *= -1;
    fb1 = lb1 || lb2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[0][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought310.getInstance(ab2, ab3, ab4, fb0);
    fb1 = !lb0;
    Output.points[0][7] -= fd0;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought42.getInstance(ad2, ad3, ad4, fd0);
    double ld1 = 275.7338794771472;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
    Output.points[0][8] -= ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb2 = !fb0;
    fb1 = lb2 || fb0;
    double ld3 = 838.1986749894453;
    fb1 = !lb2;
    boolean lb4 = false;
    ld3 *= -1;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb4, lb5, fb0, fb1);
}
    fd0 = fd1 - ld1;
    lb2 = lb4 || lb5;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb2, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}

Thought.STACK_COUNTER++;
return lb5;
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    ad1 *= -1;
    ad2 *= -1;
    ad3 *= -1;
    fb1 = ad4 > fd0;
    ab1 = fd1 < ad1;
    if (ab2) {
        ab3 = ab4 && fb0;
        boolean lb0 = true;
        fb0 = ad2 > ad3;
        fb1 = lb0 && ab1;
        ab2 = !ab3;
        Thought lo1 = Thought248.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
        ab1 = ad2 < ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        ad2 = ad3 - ad4;
        fd0 *= -1;
        Output.points[1][0] += fd1;
        fb1 = ad1 < ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    double ld1 = 852.551162335072;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    Thought lo2 = Thought224.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = lb0 && fb0;
    fd1 = ld1 - fd0;
    Output.points[1][1] += fd1;
    ld1 = fd0 + fd1;
    if (fb1) {
        Thought lo3 = Thought339.getInstance(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
        boolean lb4 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ad2 < ad3;
    Output.points[1][2] -= ad4;
    boolean lb1 = false;
    Thought lo2 = Thought339.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    lb1 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        Thought lo3 = Thought265.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
    Thought lo4 = Thought46.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, lb1, fb0);
    fb1 = ad1 > ad2;
    lb0 = lb1 || fb0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb5 = false;
if(fo0 != null){
      ad1 = fo0.m3(lb0, lb1, lb5, fb0);
}
    ad2 = ad3 + ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[1][3] += fd0;
    double ld6 = 523.4687773907009;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld6, ad1);
}
        double ld7 = 945.3980147709839;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    double ld2 = 408.134818014531;
    ab1 = !ab2;
    fd0 *= -1;
    Thought lo3 = Thought136.getInstance();
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
    ld2 *= -1;
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    fd0 *= -1;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo4 = Thought386.getInstance(fd1, ld2, fd0, fd1);
    ld2 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
}
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, lb1, ab1);
}
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought32.getInstance(lb0, lb1, ab1, ab2);
    Thought lo6 = Thought363.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ld2 = ao1.m3(fd0, fd1, ld2, fd0);
}
    Output.points[1][4] += fd1;

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
    ab2 = ad1 < ad2;
        ab3 = ab4 || fb0;
    fb1 = ad3 > ad4;
    ab1 = ab2 || ab3;
    Thought lo0 = Thought33.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
if(fo1 != null){
      ab4 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ad4 > fd0;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought224.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);

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
    Thought lo0 = Thought147.getInstance(fb1, fb0, fb1, fb0);
    Output.points[1][5] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 519.346105192269;
    for(int i0=0; i0<10; i0++){
        }
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    fb1 = fd0 < fd1;
    fb0 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    double ld2 = 105.05149613697085;
    ld2 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < ld2;
    double ld3 = 738.9625824493634;
if(fo1 != null){
      ld3 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought252.getInstance(fo1, fo0, fo1, fo0);
    fb0 = ld3 < fd0;
    fb1 = fd1 > ld1;

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
    ab1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    ab1 = !ab2;
    double ld1 = 907.3040629998226;
    boolean lb2 = false;
    ab2 = fd0 > fd1;
    ab3 = ld1 > fd0;
    boolean lb3 = false;
    Thought lo4 = Thought82.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
if(fo0 != null){
      ab3 = fo0.m2(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld1;
        lb2 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m3();
}
        Thought lo5 = Thought386.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
        Output.points[1][6] -= fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][7] += ad1;
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    ad1 *= -1;
    fb1 = !fb0;
    if (fb1) {
if(fo0 != null){
          ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
        fb0 = ad3 > ad4;
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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    boolean lb0 = false;
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought202.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    Output.points[1][8] += ad4;
    ab2 = ab3 || ab4;
    fd0 = fd1 - ad1;
    fb0 = fb1 && lb0;

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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = fd0 > fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[2][0] += fd0;
    Thought lo1 = Thought3.getInstance(fb1, lb0, fb0, fb1);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    boolean lb2 = true;
    lb0 = lb2 && fb0;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        Output.points[2][1] += fd1;
        fd0 = fd1 + fd0;
        fb1 = fd1 < fd0;
        Output.points[2][2] -= fd1;
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    lb0 = fd1 > ad1;
    double ld1 = 736.0362774805566;
    ad1 = ad2 + ad3;
    Thought lo2 = Thought328.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(ld1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    boolean lb3 = true;
    Output.points[2][3] -= ad1;
    lb3 = fb0 && fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb3, fb0, fb1);
}
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ad1, ad2);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought293.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 *= -1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = !lb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought324.getInstance();
        fb0 = fd0 > fd1;
        boolean lb3 = false;
        Output.points[2][4] += fd0;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb3, lb1, ab1);
}
        ab2 = fd1 < fd0;
        fd1 = fd0 + fd1;
        ab3 = fd0 > fd1;
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
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = ad2 > ad3;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo0 = Thought327.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
    ad3 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad4 = fd0 + fd1;
    boolean lb1 = false;
    double ld2 = 724.4193118780503;
    ab4 = ld2 > ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld2, ad1, ad2);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    lb3 = ld2 > ad1;
    boolean lb4 = false;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fb0 || fb1;

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
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
    fd1 = fd0 - fd1;
    ab4 = !fb0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought216.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    Output.points[2][5] -= fd1;
    Thought lo1 = Thought7.getInstance();
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
    if (fb0) {
        double ld3 = 361.35379364063726;
        fb1 = !lb2;
        Thought lo4 = Thought172.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
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
    fb1 = fb0 && fb1;
    Thought lo0 = Thought261.getInstance(fb0, fb1, fb0, fb1);
    fb0 = ad2 > ad3;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
    lb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;

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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    double ld1 = 967.9981118136734;
    ad3 = ad4 + fd0;
    fd1 = ld1 + ad1;
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2();
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    ad1 = ad2 - ad3;
    double ld2 = 319.79418920072976;

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
        fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    if (lb0) {
        fb0 = !fb1;
        Output.points[2][6] -= fd0;
        fd1 = fd0 - fd1;
        double ld1 = 982.1499612488872;
        lb0 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        double ld2 = 276.44122801538424;
        ld1 = ld2 + fd0;
        Thought lo3 = Thought350.getInstance(fd1, ld1, ld2, fd0);
        boolean lb4 = false;
        fb0 = !fb1;
        Thought lo5 = Thought77.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ld2, fd0);
        double ld6 = 583.4540574383274;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, ld2, lb4, lb0, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, lb0, fb0, fb1);
}
        ld6 = fd0 - fd1;
        lb4 = lb0 && fb0;
        fb1 = !lb4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought352.getInstance();
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, fb0, fb1);
}
    lb1 = fd0 < fd1;
    ad1 *= -1;
    fb0 = fb1 && lb1;
    fb0 = ad2 < ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab1 = fd1 < fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 970.3439706135355;
    ld0 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ld0 *= -1;
    if (ab3) {
        ab4 = fb0 || fb1;
        Output.points[2][7] -= fd0;
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
    ad1 = ad2 + ad3;
    ab1 = ad4 < fd0;
    boolean lb0 = false;
    double ld1 = 899.5307963009909;
    Thought lo2 = Thought269.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 + ld1;
    ad1 *= -1;
        ad2 = ad3 + ad4;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ld1, ad1);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
}
    ab2 = !ab3;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, ab1, ab2, ab3);
}
        fd1 *= -1;
    ld1 = ad1 - ad2;
    ab4 = fb0 && fb1;
    lb0 = ad3 < ad4;
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4();
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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought15.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    double ld1 = 616.5532155292822;
    double ld2 = 45.35417032873914;
if(fo1 != null){
      ld1 = fo1.m3(ld2, fd0, fd1, ld1);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ld2, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
    lb3 = fd0 > fd1;
    Thought lo4 = Thought367.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, fb1, lb3, fb0, fb1);
}
    ld1 *= -1;

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
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    double ld1 = 186.44401163615277;
    boolean lb2 = true;
    boolean lb3 = true;
    lb0 = !lb2;
    boolean lb4 = true;
    lb3 = lb4 || fb0;
    fd0 *= -1;
    fb1 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld1;
    boolean lb5 = false;
    Thought lo6 = Thought385.getInstance(fd0, fd1, ld1, fd0);
    boolean lb7 = false;
    lb0 = fd1 > ld1;
    boolean lb8 = true;
    Output.points[2][8] += fd0;
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;

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
    boolean lb0 = true;
    Thought lo1 = Thought392.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    Thought lo3 = Thought87.getInstance(fb1, lb0, lb2, fb0);
    double ld4 = 497.9098676207441;
    ld4 = fd0 - fd1;
    fb1 = lb0 || lb2;
    boolean lb5 = false;
    boolean lb6 = true;
    double ld7 = 373.91540742655565;
    lb5 = ld4 > ld7;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld4, ld7, fd0);
}
    lb6 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld4, ld7, fd0, fd1);
}
    fb1 = lb0 || lb2;
    double ld8 = 527.0510502442264;
    ld4 = ld7 - ld8;
    boolean lb9 = true;
    fd0 *= -1;
    lb5 = lb6 && lb9;
    Thought lo10 = Thought151.getInstance(fd1, ld4, ld7, ld8, fb0, fb1, lb0, lb2);
    lb5 = fd0 < fd1;
    lb6 = ld4 > ld7;

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
