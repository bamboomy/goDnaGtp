package genetic;
import java.util.ArrayList;
class Thought46 extends Thought{
private static ArrayList<Thought46> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 332.14206738001604;
private double fd1 = 961.263029812224;
private Thought fo0 = null;
private Thought fo1 = null;
Thought46 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought46 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought46 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought46 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought46 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought46 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought46 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought46 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought46 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 605.6377367221555;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2();
}
    fb0 = ld0 > fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
            fb0 = fb1 && lb1;
    fb0 = ld0 > fd0;
    fb1 = !lb1;
    Thought lo2 = Thought29.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
    Output.points[4][6] += ld0;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    ld0 *= -1;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    lb1 = !fb0;
    Output.points[4][7] -= fd1;
    double ld3 = 721.1624698047118;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    ld3 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld4 = 691.5010701237746;

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
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought37.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1();
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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    fb0 = !fb1;
    fb0 = ad3 > ad4;
    fd0 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    Output.points[4][8] -= ad3;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
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
        Output.points[5][0] -= ad2;
    Thought lo0 = Thought94.getInstance(ab4, fb0, fb1, ab1);
    boolean lb1 = true;
    boolean lb2 = true;
    ad3 = ad4 - fd0;
if(fo1 != null){
      lb2 = fo1.m2();
}
    ab1 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
        }
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    boolean lb4 = false;
    ab4 = fb0 && fb1;

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
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    if (fb1) {
        fb0 = !fb1;
        fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        double ld0 = 355.49187935124456;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
        fd1 = ld0 + fd0;
        if (fb1) {
            fd1 = ld0 + fd0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao2 != null){
              ld0 = ao2.m3(fb0, fb1, fb0, fb1);
}
            fd0 *= -1;
            fd1 = ld0 - fd0;
if(ao3 != null){
              ao3.m3();
}
            boolean lb1 = true;
            Output.points[5][1] += fd1;
            lb1 = fb0 || fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
    double ld0 = 238.28671739811585;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = !fb1;
    Output.points[5][2] += ad1;
    lb1 = fb0 || fb1;
    Output.points[5][3] += ad2;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
if(ao1 != null){
      ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m3();
}
    fd0 *= -1;
    lb2 = fd1 < ld0;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
        fd1 = ld0 - ad1;

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
    ab2 = fd0 < fd1;
    boolean lb0 = true;
    ab2 = !ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[5][4] -= fd1;
    double ld1 = 797.3052854749429;
    lb0 = !ab1;
    boolean lb2 = true;
    double ld3 = 678.9136946978928;
if(fo0 != null){
      ab1 = fo0.m2(ld1, ld3, fd0, fd1);
}
    ab2 = ld1 < ld3;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, ld3, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, ld3, fd0, fd1, lb0, lb2, ab1, ab2);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo4 = Thought63.getInstance(ao3, ao4, fo0, fo1, ld1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb2, ab1, ab2);
}
    ab3 = ld1 < ld3;
    fd0 *= -1;
    ab4 = !fb0;
    fb1 = fd1 > ld1;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    double ld0 = 145.50232540938697;
if(ao1 != null){
      ab1 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
    Output.points[5][5] += ad3;
    ab2 = ab3 || ab4;
    Output.points[5][6] -= ad4;
    fd0 = fd1 - ld0;
    Output.points[5][7] += ad1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      ao2.m2();
}
    fb1 = ad2 < ad3;
if(ao3 != null){
      ab1 = ao3.m2(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought15.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ld0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ad1 *= -1;
    ab4 = ad2 > ad3;

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
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[5][8] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 275.30540905256015;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 - fd1;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fd1 *= -1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
            fd0 = fd1 - fd0;
    Thought lo2 = Thought6.getInstance(fb0, fb1, lb0, lb1);

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
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb0 = true;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought13.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
    fd0 = fd1 + ad1;
    Output.points[6][0] -= ad2;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    if (lb0) {
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 7.019151865061656;
    Output.points[6][1] += ad1;
        ab1 = ad2 > ad3;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (ab4) {
        ad4 = fd0 + fd1;
        fb0 = fb1 && lb1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Output.points[6][2] += fd1;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 321.20310904794314;
    Output.points[6][3] -= ld0;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought73.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
    fb0 = fd1 > ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    fb1 = fd0 > fd1;
if(ao1 != null){
      ld0 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought53.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
    boolean lb4 = false;
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    lb4 = !fb0;
    ld0 *= -1;
    fb1 = !lb3;

Thought.STACK_COUNTER++;
return lb4;
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
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = ad1 < ad2;
    double ld2 = 391.54365194198425;
    double ld3 = 729.7614111688735;
    double ld4 = 465.39442622840085;
    lb1 = ld4 > ad1;
    fb0 = ad2 > ad3;
    boolean lb5 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
    double ld6 = 603.4488173215653;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, lb1);
}
    ld3 = ld4 + ld6;
    lb5 = !fb0;
    fb1 = lb0 && lb1;
    lb5 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ad1 < ad2;
if(ao3 != null){
      lb0 = ao3.m2(ad3, ad4, fd0, fd1, lb1, lb5, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ab2 = ab3 && ab4;
    Output.points[6][4] += ad3;
    fb0 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    Output.points[6][5] -= ad4;
    ab4 = fd0 > fd1;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    ab2 = fd1 < ad1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    Output.points[6][6] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab2 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    double ld1 = 44.197617179288734;
    fb0 = ld1 > fd0;
    boolean lb2 = false;
    Output.points[6][7] -= fd1;
    Thought lo3 = Thought24.getInstance(ld1, fd0, fd1, ld1);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    Output.points[6][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
}
    lb2 = fd1 > ld1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[7][0] += fd0;
        boolean lb4 = true;
        double ld5 = 409.86043778660553;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought69.getInstance();
    fb1 = ab1 && ab2;
    boolean lb1 = true;
    ab2 = fd0 < fd1;
    Output.points[7][1] += fd0;
    boolean lb2 = false;
    Thought lo3 = Thought8.getInstance(fd1, fd0, fd1, fd0);
    ab2 = fd1 < fd0;
    ab3 = ab4 && fb0;

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
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    double ld1 = 921.1517469825499;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    lb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = true;
    Output.points[7][2] -= fd1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 271.4932207759253;
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
    fd1 *= -1;
    ab2 = ld0 > ad1;
    ad2 = ad3 - ad4;
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought89.getInstance(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
        ad4 *= -1;
        if (ab2) {
            ab3 = ab4 || fb0;
if(fo0 != null){
              fo1 = fo0.m4();
}
            Thought lo2 = Thought32.getInstance(fd0, fd1, ld0, ad1);
if(fo0 != null){
              fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
            ab4 = fd1 > ld0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
            ab3 = fd0 < fd1;
            for(int i1=0; i1<10; i1++){
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
                  fo1.m3(fo0, fo1, fo0, fo1);
}
                ab2 = ab3 && ab4;
}}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[7][3] -= fd1;
    boolean lb0 = false;
if(ao3 != null){
          ao2 = ao3.m4();
}
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][4] += ad2;
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao3.m1(fb1, lb0, fb0, fb1);
}
    double ld1 = 662.5628873649852;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    lb0 = fd1 > ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    lb0 = ab1 || ab2;
    Output.points[7][5] += fd1;
    ab3 = ab4 || fb0;
    fb1 = lb0 || ab1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(ao2 != null){
      ao2.m3();
}
        fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
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
    ad1 = ad2 - ad3;
    ab1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    ab2 = ad3 > ad4;
    ab3 = !ab4;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    boolean lb0 = false;
    Output.points[7][6] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    ab1 = ab2 || ab3;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m1();
}
    Thought lo1 = Thought92.getInstance(fd0, fd1, ad1, ad2);
    Output.points[7][7] -= ad3;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb0;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
        fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 528.5103973715429;
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
    fd0 = fd1 - fd0;
        Thought lo1 = Thought30.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
    ab1 = fd0 > fd1;

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 531.7956933430021;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[7][8] += ad1;
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    boolean lb2 = false;

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
    Output.points[8][0] -= ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    fd0 *= -1;
    ab4 = fb0 && fb1;

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
    Thought lo0 = Thought94.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
    Output.points[8][1] += ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
    fd0 = fd1 + ad1;
    Thought lo2 = Thought32.getInstance();
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(lb1, lb3, fb0, fb1);
}
    Output.points[8][2] += ad3;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    Output.points[8][3] -= ad2;
    boolean lb4 = true;

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
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
        ab3 = fd0 > fd1;
        boolean lb1 = false;
        boolean lb2 = false;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        Output.points[8][4] -= fd1;
        Thought lo3 = Thought32.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, lb2, lb0);
        Output.points[8][5] += fd0;
        double ld4 = 941.143618778529;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        ab1 = ab2 || ab3;
        boolean lb5 = false;
        ab3 = fd0 > fd1;
        ab4 = fb0 && fb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
    double ld0 = 233.89997260184697;
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld1 = 543.6521178153931;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ld1 = ad1 + ad2;
    if (ab3) {
if(ao1 != null){
          ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fb1 = !ab1;
        ad3 = ad4 - fd0;
        fd1 = ld0 - ld1;
        Output.points[8][6] -= ad1;
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        } else {
        double ld2 = 218.12718795417152;
        Thought lo3 = Thought40.getInstance(ao1, ao2, ao3, ao4, ld2, ld0, ld1, ad1, ab2, ab3, ab4, fb0);
        fb1 = ab1 && ab2;
        ad2 = ad3 - ad4;
        boolean lb4 = false;
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
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld0 = 241.73124893355026;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    double ld2 = 401.7529306107355;
    lb1 = !fb0;
    Thought lo3 = Thought15.getInstance(ld0, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
        ld0 *= -1;

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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = fb0 && fb1;
    double ld1 = 45.653961804246634;
    Thought lo2 = Thought56.getInstance();
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    Thought lo4 = Thought82.getInstance(lb0, lb3, fb0, fb1);
    lb0 = lb3 && fb0;
    fd1 = ld1 + fd0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
        Output.points[8][7] += ld1;
    Thought lo5 = Thought40.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, lb3, fb0, fb1);
    fd1 = ld1 + fd0;

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    double ld0 = 668.5905229514959;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought32.getInstance(fd0, fd1, ld0, fd0);
    Output.points[8][8] += fd1;
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
        Output.points[0][0] -= fd0;

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
