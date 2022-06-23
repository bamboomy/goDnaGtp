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
if(fo0 != null){
      fo0.m2();
}
    fb0 = ld0 > fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
            fb0 = fb1 && lb1;
    fb0 = ld0 > fd0;
    fb1 = !lb1;
    Thought lo2 = Thought29.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
    Output.points[0][7] += ld0;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ld0 *= -1;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    lb1 = !fb0;
    Output.points[0][8] -= fd1;
    double ld3 = 721.1624698047118;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    ld3 *= -1;
if(fo0 != null){
      fd0 = fo0.m3();
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
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought37.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    fb0 = !fb1;
    fb0 = ad3 > ad4;
    fd0 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    Output.points[1][0] -= ad3;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
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
        Output.points[1][1] -= ad2;
    Thought lo0 = Thought94.getInstance(ab4, fb0, fb1, ab1);
    boolean lb1 = true;
    boolean lb2 = true;
    ad3 = ad4 - fd0;
if(fo0 != null){
      lb2 = fo0.m2();
}
    ab1 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
        }
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    if (fb1) {
        fb0 = !fb1;
        fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        double ld0 = 355.49187935124456;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
        fd1 = ld0 + fd0;
        if (fb1) {
            fd1 = ld0 + fd0;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
              ld0 = ao3.m3(fb0, fb1, fb0, fb1);
}
            fd0 *= -1;
            fd1 = ld0 - fd0;
if(ao4 != null){
              ao4.m3();
}
            boolean lb1 = true;
            Output.points[1][2] += fd1;
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
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
    double ld0 = 238.28671739811585;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = !fb1;
    Output.points[1][3] += ad1;
    lb1 = fb0 || fb1;
    Output.points[1][4] += ad2;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(lb2, fb0, fb1, lb1);
}
if(ao2 != null){
      ao2.m3();
}
    fd0 *= -1;
    lb2 = fd1 < ld0;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
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
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[1][5] -= fd1;
    double ld1 = 797.3052854749429;
    lb0 = !ab1;
    boolean lb2 = true;
    double ld3 = 678.9136946978928;
if(fo1 != null){
      ab1 = fo1.m2(ld1, ld3, fd0, fd1);
}
    ab2 = ld1 < ld3;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, ld3, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(ld1, ld3, fd0, fd1, lb0, lb2, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    Thought lo4 = Thought63.getInstance(ao4, fo0, fo1, ao1, ld1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb2, ab1, ab2);
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
if(ao2 != null){
      ab1 = ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    Output.points[1][6] += ad3;
    ab2 = ab3 || ab4;
    Output.points[1][7] -= ad4;
    fd0 = fd1 - ld0;
    Output.points[1][8] += ad1;
if(ao2 != null){
      fb0 = ao2.m2(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao3 != null){
      ao3.m2();
}
    fb1 = ad2 < ad3;
if(ao4 != null){
      ab1 = ao4.m2(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought15.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
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
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[2][0] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 275.30540905256015;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fd1 *= -1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb1 = false;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought13.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
    fd0 = fd1 + ad1;
    Output.points[2][1] -= ad2;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    if (lb0) {
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
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
    Output.points[2][2] += ad1;
        ab1 = ad2 > ad3;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Output.points[2][3] += fd1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 321.20310904794314;
    Output.points[2][4] -= ld0;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought73.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
    fb0 = fd1 > ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought53.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
    boolean lb4 = false;
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2);
}
    double ld6 = 603.4488173215653;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, lb1);
}
    ld3 = ld4 + ld6;
    lb5 = !fb0;
    fb1 = lb0 && lb1;
    lb5 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ad1 < ad2;
if(ao4 != null){
      lb0 = ao4.m2(ad3, ad4, fd0, fd1, lb1, lb5, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
    Thought lo0 = Thought80.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    double ld1 = 881.975133126164;
    boolean lb2 = true;
    double ld3 = 253.17509213188123;
    fb0 = fb1 && lb2;
    boolean lb4 = true;
    lb4 = ab1 || ab2;
    ld1 = ld3 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    fd1 = ld1 + ld3;
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ld1, ld3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld3);
}
if(ao1 != null){
      fo1 = ao1.m4(lb4, ab1, ab2, ab3);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    Output.points[2][5] -= fd1;
    ld1 = ld3 + fd0;
    ab4 = fb0 && fb1;
    boolean lb5 = true;
    boolean lb6 = true;
if(ao3 != null){
      ao3.m1(fd1, ld1, ld3, fd0, lb2, lb4, lb5, lb6);
}
    fd1 = ld1 + ld3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[2][6] -= fd1;
    ad1 *= -1;
    ad2 *= -1;
    boolean lb1 = false;
        ad3 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      lb0 = ao1.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Thought lo2 = Thought88.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m2(lb1, ab1, ab2, ab3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = fd0 > fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        Thought lo1 = Thought50.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
        lb0 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4();
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    Thought lo0 = Thought37.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
        double ld0 = 175.20533306533395;
    fb0 = ld0 > ad1;
    if (fb1) {
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1();
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fd1 = ld0 - ad1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ld0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought10.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    ab2 = fd0 < fd1;
    Thought lo1 = Thought99.getInstance(ad1, ad2, ad3, ad4);
    if (ab3) {
        Thought lo2 = Thought93.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
        Output.points[2][7] -= ad3;
        Thought lo3 = Thought4.getInstance(ab4, fb0, fb1, ab1);
        double ld4 = 259.57390816194487;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fd1 = fo0.m3();
}
        ab2 = ab3 || ab4;
        boolean lb5 = true;
        ab4 = !fb0;
if(fo1 != null){
          fo1.m2(ld4, ad1, ad2, ad3, fb1, lb5, ab1, ab2);
}
        ab3 = ad4 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ld4 = ad1 - ad2;
        boolean lb6 = false;
        Output.points[2][8] += ad3;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4, ab3, ab4, fb0, fb1);
}
        Output.points[3][0] -= ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb5, lb6, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        ab3 = ab4 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld4, ad1, ad2);
}
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
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2();
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    Thought lo1 = Thought80.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought51.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
    double ld4 = 947.6018153696717;
if(ao3 != null){
      ao2 = ao3.m4(lb3, fb0, fb1, lb0);
}
    Thought lo5 = Thought41.getInstance();
    lb3 = fb0 && fb1;
    Thought lo6 = Thought38.getInstance(ld4, fd0, fd1, ld4, lb0, lb3, fb0, fb1);
    double ld7 = 305.02829350232554;
    lb0 = ld7 < fd0;
    fd1 = ld4 + ld7;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld4, ld7, lb3, fb0, fb1, lb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    double ld0 = 160.50944798787862;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    Output.points[3][1] -= fd1;
    Thought lo1 = Thought52.getInstance(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
    fb1 = fb0 && fb1;
if(ao2 != null){
      ad4 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3();
}
    double ld2 = 836.0085519129389;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
    ld2 *= -1;
    double ld4 = 397.94833688779875;
    ld4 *= -1;
    boolean lb5 = false;
    lb3 = lb5 && fb0;
    for(int i0=0; i0<10; i0++){
        Output.points[3][2] -= ad1;
        Output.points[3][3] -= ad2;
        double ld6 = 726.0829682566776;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    double ld0 = 319.5546147567079;
    fd0 = fd1 + ld0;
    double ld1 = 303.8069956405833;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0);
}
    ab4 = fb0 || fb1;
    ld1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld0, ld1, fd0, fd1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
          fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m2();
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
    ab1 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3(lb0, lb1, ab1, ab2);
}
if(ao2 != null){
      ad4 = ao2.m3();
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[3][4] -= fd0;
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    Thought lo1 = Thought88.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
    Thought lo0 = Thought27.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = !fb0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
    fd0 *= -1;
    Output.points[3][5] += fd1;
    Thought lo2 = Thought84.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
    Output.points[3][6] += fd1;
    Output.points[3][7] -= fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
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
    boolean lb0 = true;
    lb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    ad3 *= -1;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, fb0);
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
    Output.points[3][8] -= ad2;
    Thought lo0 = Thought35.getInstance();
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
        Thought lo1 = Thought43.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        Output.points[4][0] += ad4;
        fb1 = !ab1;
        fd0 = fd1 + ad1;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
        boolean lb2 = true;
        ab3 = ad2 > ad3;
        Thought lo3 = Thought50.getInstance(ad4, fd0, fd1, ad1);
        ad2 *= -1;
        ad3 *= -1;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        }
    boolean lb4 = false;
    Output.points[4][1] -= ad2;
    fb0 = ad3 < ad4;
    fb1 = !lb4;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1(lb5, ab1, ab2, ab3);
}
    Thought lo6 = Thought84.getInstance();

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
        boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought42.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    Output.points[4][2] += fd1;
    Output.points[4][3] -= fd0;
        fb1 = fd1 < fd0;
    lb0 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][4] -= ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        Output.points[4][5] -= fd1;
        boolean lb0 = false;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
        fd0 = fd1 - ad1;
        fb1 = ad2 < ad3;
        }
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = ad2 > ad3;
    Thought lo1 = Thought74.getInstance(ad4, fd0, fd1, ad1);
    Thought lo2 = Thought48.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought30.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        }
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    ab3 = !ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought96.getInstance(fb0, fb1, ab1, ab2);
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    ab1 = fd1 < fd0;

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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    if (fb0) {
        ad1 = ad2 + ad3;
        boolean lb1 = true;
        fb0 = !fb1;
        Thought lo2 = Thought14.getInstance(ad4, fd0, fd1, ad1, lb1, lb0, ab1, ab2);
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
        ab3 = ab4 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, lb0, ab1);
}
        } else {
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
        lb0 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ad1 = ad2 + ad3;
        ab1 = ad4 < fd0;
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
        ab2 = ab3 && ab4;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        boolean lb3 = true;
        fd0 = fd1 + ad1;
                ad2 = ad3 + ad4;
if(fo1 != null){
          fo1.m3(ab4, fb0, fb1, lb3);
}
        lb0 = ab1 || ab2;
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
    Thought lo0 = Thought48.getInstance();
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    Thought lo3 = Thought69.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought45.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb5 = true;
if(fo0 != null){
      lb1 = fo0.m2(lb2, lb5, fb0, fb1);
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
    Thought lo0 = Thought66.getInstance();
    Output.points[4][6] -= fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    double ld1 = 872.8260151750022;
    ld1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ld1 > fd0;
    boolean lb2 = false;
    boolean lb3 = true;
    double ld4 = 790.7520664064441;
    lb3 = fb0 && fb1;
    fd0 = fd1 - ld1;
    ld4 = fd0 - fd1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld4, fd0, fd1, lb3, fb0, fb1, lb2);
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
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought91.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    fd0 *= -1;
    lb1 = fd1 < fd0;
    Output.points[4][7] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Output.points[4][8] += fd0;

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
