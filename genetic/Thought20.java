package genetic;
import java.util.ArrayList;
class Thought20 extends Thought{
private static ArrayList<Thought20> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 545.2283534241533;
private double fd1 = 371.6074750127386;
private Thought fo0 = null;
private Thought fo1 = null;
Thought20 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought20 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought20 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought20 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought20 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought20 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought20 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought20 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought20 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought20 instance = new Thought20 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought20 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought20 instance = new Thought20 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought20 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought20 instance = new Thought20 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought20 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought20 instance = new Thought20 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought20 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought20 instance = new Thought20 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought20 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought20 instance = new Thought20 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought20 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought20 instance = new Thought20 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought20 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought20 instance = new Thought20 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    Thought lo0 = Thought96.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    double ld2 = 41.67118331325556;
    fd0 = fd1 + ld2;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    Output.points[2][6] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fd0 = fd1 + ld2;
    fb0 = fb1 || lb1;
    fb0 = fd0 > fd1;
    fb1 = lb1 && fb0;
    fb1 = ld2 < fd0;
    double ld3 = 473.7343208741823;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought5.getInstance(fd0, fd1, ld2, ld3, fb0, fb1, lb1, fb0);
    fd0 = fd1 - ld2;
    ld3 *= -1;
    fd0 *= -1;
    fb1 = fd1 > ld2;

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
    double ld0 = 872.2620282132962;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab1 = fd1 > ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
    ab4 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought35.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    ab2 = !ab3;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought0.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought90.getInstance(fd1, ad1, ad2, ad3);
    if (fb1) {
        fb0 = fb1 || fb0;
        double ld2 = 526.7714398801315;
        ad3 *= -1;
        boolean lb3 = false;
        ad4 = fd0 + fd1;
        boolean lb4 = true;
        lb4 = fb0 || fb1;
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
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
            fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Output.points[2][7] += ad1;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab1 = ad2 < ad3;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = ad2 < ad3;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3();
}
    fb0 = !fb1;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 778.7171144538876;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ld0;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought14.getInstance(ao1, ao2, ao3, ao4);
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[2][8] += fd0;
    for(int i0=0; i0<10; i0++){
        double ld1 = 750.0446544959659;
        double ld2 = 299.0317418792177;
        ad4 *= -1;
if(fo1 != null){
          fd0 = fo1.m3();
}
        fd1 *= -1;
        Thought lo3 = Thought85.getInstance(ld1, ld2, ad1, ad2);
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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Output.points[3][0] -= fd0;
    boolean lb0 = false;
    ab4 = fb0 || fb1;
    lb0 = fd1 < fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
        Output.points[3][1] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;
    Output.points[3][2] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = false;
    fd1 *= -1;
    boolean lb2 = false;
    fd0 *= -1;

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
    ad2 = ad3 - ad4;
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    Thought lo0 = Thought43.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    Thought lo1 = Thought66.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab4 = fb0 || fb1;
    ad1 *= -1;
    ab1 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    Thought lo3 = Thought23.getInstance();
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || lb2;
    ab1 = ab2 && ab3;

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
      fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought78.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
    Thought lo2 = Thought35.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    Output.points[3][3] -= fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    lb1 = fb0 && fb1;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought97.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1();
}
    double ld2 = 61.79637217840837;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought8.getInstance(lb1, ab1, ab2, ab3);
    fd1 *= -1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = fd1 > ld2;
        Thought lo4 = Thought27.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = ld2 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld2, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = !lb1;
    ld2 = fd0 - fd1;

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
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought7.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    double ld1 = 267.28365912282885;
    ad3 = ad4 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fd1, ld1, ad1, ad2, fb0, fb1, lb2, fb0);
}
    fb1 = ad3 < ad4;
    double ld3 = 664.4478010261018;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 165.58178148150918;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[3][4] += ad1;
        ad2 *= -1;
    ab2 = ad3 > ad4;
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    if (fb1) {
        Output.points[3][5] += ld0;
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo1.m3(lb1, ab1, ab2, ab3);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && fb0;
    if (fb1) {
if(fo1 != null){
          fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought8.getInstance();
        fb1 = fd1 > fd0;
        } else {
        fb0 = fd1 > fd0;
        fb1 = fd1 < fd0;
        boolean lb1 = false;
        double ld2 = 754.8401143689675;
if(ao1 != null){
          lb1 = ao1.m2(fd0, fd1, ld2, fd0);
}
if(ao2 != null){
          ao2.m3(fb0, fb1, lb1, fb0);
}
        fb1 = lb1 || fb0;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
        Output.points[3][6] -= ld2;
        fd0 = fd1 - ld2;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought44.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      fb0 = ao4.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    double ld2 = 559.2403609947906;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2);
}
    fb1 = !lb1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb3 = false;
    fd1 *= -1;
    fb0 = ld2 < ad1;
    ad2 = ad3 - ad4;
    Output.points[3][7] += fd0;
    fb1 = fd1 < ld2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, lb3, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;
    ab4 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
        fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = fd1 > fd0;
    boolean lb0 = true;
    ab2 = fd1 < fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought89.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought11.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought83.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Output.points[3][8] += ad2;
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    if (fb1) {
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        } else if (ab1) {
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought52.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd1 = ao3.m3(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fd0 *= -1;
        Thought lo2 = Thought57.getInstance();
if(ao4 != null){
          fd1 = ao4.m3(ad1, ad2, ad3, ad4);
}
        Output.points[4][0] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
        fd1 = ad1 + ad2;
        Thought lo3 = Thought64.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
        ad1 = ad2 - ad3;
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
    boolean lb0 = false;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    double ld2 = 337.43636080294243;
    lb0 = lb1 || fb0;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - ld2;
    lb0 = fd0 < fd1;
    Output.points[4][1] += ld2;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fd0 < fd1;
    boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    lb3 = fd0 > fd1;
if(fo1 != null){
      ld2 = fo1.m3();
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    double ld0 = 855.0694671486294;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ab3 = ld0 < fd0;
    ab4 = fb0 && fb1;
    fd1 *= -1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Thought lo2 = Thought44.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
    ab1 = ab2 || ab3;
    boolean lb3 = false;
    double ld4 = 248.32312972115432;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
    fb1 = ld4 > fd0;

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
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
        fb1 = ad4 < fd0;
    fb0 = !fb1;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, lb0, lb1, lb2, fb0);
}
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4();
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 192.71419332505025;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    Thought lo1 = Thought81.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ld0 < ad1;
    ab1 = ad2 > ad3;
    boolean lb2 = false;
    ab1 = ab2 || ab3;
    Thought lo3 = Thought18.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
    Output.points[4][2] += ad4;

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
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
        boolean lb0 = false;
    lb0 = fd0 > fd1;
    double ld1 = 594.9352858552003;
    ld1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    ld1 = fd0 + fd1;
    fb0 = fb1 && lb0;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought50.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
if(fo1 != null){
          fb1 = fo1.m2();
}
if(ao1 != null){
      fd1 = ao1.m3(ld1, fd0, fd1, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    if (fb0) {
        fb1 = fd0 < fd1;
        for(int i0=0; i0<10; i0++){
            }
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
        if (lb0) {
        fd1 = ad1 - ad2;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        fb1 = ad1 > ad2;
        boolean lb1 = false;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, lb1, lb0, fb0, fb1);
}
        lb1 = lb0 && fb0;
        fb1 = lb1 && lb0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb2 = true;
        boolean lb3 = true;
        lb3 = !lb0;
        ad3 = ad4 + fd0;
        fd1 = ad1 - ad2;
        boolean lb4 = false;
        lb0 = ad3 > ad4;
        Output.points[4][3] += fd0;
        boolean lb5 = false;
if(fo1 != null){
          fo1.m2(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb1);
}
        lb2 = lb3 || lb4;
if(ao1 != null){
          ao1.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Output.points[4][4] += fd0;
if(ao4 != null){
      fd1 = ao4.m3(ab1, ab2, ab3, ab4);
}
    Output.points[4][5] -= fd0;
    Output.points[4][6] += fd1;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
    lb1 = ab1 || ab2;
    ab3 = !ab4;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought14.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    lb1 = lb3 || ab1;
    boolean lb4 = true;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb5 = true;
    ab4 = fb0 && fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, lb1, lb3, lb4);
}
    lb5 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    ab2 = fd0 < fd1;

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
    double ld0 = 595.7766475264223;
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(ao1 != null){
      ab3 = ao1.m2(fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
    Output.points[4][7] += ad3;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ld0);
}
    ab2 = !ab3;
    Thought lo1 = Thought53.getInstance(ab4, fb0, fb1, ab1);
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
}
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
    Output.points[4][8] += ad2;
    Thought lo2 = Thought16.getInstance();
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 104.11717981349919;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought68.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    boolean lb3 = false;
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb3);
}
    lb4 = !fb0;
    fb1 = ld0 > fd0;
    fd1 = ld0 + fd0;

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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1();
}
    ab4 = fb0 && fb1;
    fd0 *= -1;
    lb0 = ab1 && ab2;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Output.points[5][0] += fd1;

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
    Thought lo0 = Thought48.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    double ld2 = 200.65754608294705;
    boolean lb3 = true;
    if (lb3) {
        boolean lb4 = false;
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb4, lb1);
}
        boolean lb5 = false;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
        double ld6 = 99.17918208218799;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ld6, lb1, lb3, fb0, fb1);
}
        lb4 = ld2 > ad1;
if(fo1 != null){
          ad2 = fo1.m3();
}
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1);
}
        lb5 = !lb1;
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
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 822.2841462791247;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ab3 = !ab4;
    fb0 = ad4 < fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought6.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
    Thought lo3 = Thought53.getInstance();

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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    fb1 = lb0 && fb0;
    fb1 = fd1 < fd0;
    Thought lo1 = Thought52.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || fb0;
        boolean lb1 = false;
        Thought lo2 = Thought69.getInstance(ao2, ao3, ao4, fo0);
        double ld3 = 189.2413676455715;
        }
    fb1 = ad2 < ad3;
    lb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    Thought lo4 = Thought16.getInstance();
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Thought lo5 = Thought10.getInstance(fd1, ad1, ad2, ad3);
    Thought lo6 = Thought3.getInstance(fb1, lb0, fb0, fb1);
    boolean lb7 = true;
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 || ab3;
        fd0 = fd1 + fd0;
        }
    fd1 = fd0 - fd1;
    Output.points[5][1] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    Output.points[5][2] += fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought76.getInstance();
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    double ld1 = 898.8956673855162;
    fb0 = fb1 || lb0;
    ab1 = ad4 < fd0;
    if (ab2) {
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3);
}
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 && ab3;
        fd1 = ld1 - ad1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab4 = ad2 > ad3;
        ad4 = fd0 - fd1;
        ld1 = ad1 + ad2;
        fb0 = fb1 || lb0;
        ad3 *= -1;
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought12.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
        lb0 = fd1 < fd0;
    boolean lb3 = false;
    Thought lo4 = Thought74.getInstance(fo1, fo0, fo1, fo0, lb1, lb3, fb0, fb1);
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
        lb1 = lb3 && fb0;
    Output.points[5][3] -= fd1;
    boolean lb5 = true;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    Thought lo6 = Thought52.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb7 = true;
    lb1 = fd1 < fd0;
    lb3 = fd1 < fd0;

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
    fd1 = fd0 + fd1;
    double ld0 = 359.16768134922427;
    Thought lo1 = Thought92.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !fb0;
    boolean lb2 = true;
    Output.points[5][4] += fd0;
    fb0 = fd1 > ld0;
        fb1 = !lb2;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    Thought lo3 = Thought86.getInstance(fb0, fb1, lb2, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    double ld4 = 324.38850701082134;
        fb1 = !lb2;
    fd0 = fd1 - ld0;
    boolean lb5 = false;
    lb5 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld0, lb2, lb5, fb0, fb1);
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
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought15.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
