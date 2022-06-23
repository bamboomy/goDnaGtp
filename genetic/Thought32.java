package genetic;
import java.util.ArrayList;
class Thought32 extends Thought{
private static ArrayList<Thought32> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 948.9309487042874;
private double fd1 = 417.08083890928697;
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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    double ld1 = 953.9625905324174;
    double ld2 = 634.9633460753396;
    ld2 *= -1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    ld2 = fd0 + fd1;
    Output.points[8][0] += ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        boolean lb3 = false;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld2, fd0, fd1, ld1, fb1, lb3, fb0, fb1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    Thought lo0 = Thought95.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    lb1 = fd1 < fd0;
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, ab1, ab2);
}
    fd1 = fd0 + fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[8][1] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Output.points[8][2] += ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    if (fb0) {
        fb1 = ad4 > fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        Thought lo1 = Thought63.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
if(fo1 != null){
          ad4 = fo1.m3();
}
        fd0 *= -1;
        fd1 = ad1 - ad2;
        ad3 *= -1;
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[8][3] -= ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ad3 > ad4;
    Thought lo1 = Thought0.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + ad1;
    boolean lb2 = false;
    Output.points[8][4] += ad2;
    ab1 = ad3 < ad4;
if(fo0 != null){
          fo0.m1(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought17.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb1 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb2, ab1, ab2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought11.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb1 = true;
    Thought lo2 = Thought45.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
    lb1 = !fb0;
    boolean lb3 = true;
    Thought lo4 = Thought51.getInstance();
    Thought lo5 = Thought81.getInstance(fd0, fd1, ad1, ad2);
if(ao4 != null){
      ao4.m3(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb0);
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
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 290.8268671516132;
    fb0 = fb1 && ab1;
    Thought lo1 = Thought61.getInstance();
    ab2 = fd0 < fd1;
    boolean lb2 = false;
    Thought lo3 = Thought4.getInstance(ld0, fd0, fd1, ld0);
    ab2 = fd0 < fd1;
    ab3 = ld0 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb2);
}
    boolean lb4 = true;
    boolean lb5 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
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
    Output.points[8][5] += ad1;
    ad2 *= -1;
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    ab1 = fd1 < ad1;
    boolean lb1 = true;
    ab1 = ad2 < ad3;
    Thought lo2 = Thought10.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
    Thought lo3 = Thought26.getInstance(ao3, ao4, fo0, fo1);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    if (fb0) {
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        double ld0 = 760.9804392240799;
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + ld0;
        fd0 = fd1 + ld0;
        fb0 = fb1 || fb0;
        fd0 = fd1 + ld0;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
        fb0 = fd0 < fd1;
        double ld1 = 893.569492837142;
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
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought2.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb1 = fo0.m2();
}
    if (ab1) {
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
        boolean lb3 = false;
        boolean lb4 = false;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo6 = Thought89.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, lb3, lb4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 *= -1;
    Thought lo1 = Thought44.getInstance(fd0, fd1, ad1, ad2);
    boolean lb2 = false;
    lb2 = ad3 < ad4;

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
    double ld0 = 174.4662091501845;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld1 = 137.29459640356413;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    fb1 = ab1 || ab2;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    fd1 *= -1;
    Thought lo3 = Thought25.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ld0 = fo0.m3(ld1, ad1, ad2, ad3, fb0, fb1, lb2, ab1);
}
    ab2 = ad4 > fd0;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, ad1, ad2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Output.points[8][6] -= fd0;
    Output.points[8][7] += fd1;
    lb0 = fb0 || fb1;
    Output.points[8][8] -= fd0;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    boolean lb2 = true;
    lb0 = fd1 > fd0;
    boolean lb3 = false;
    Output.points[0][0] -= fd1;
    lb1 = !lb2;
    Thought lo4 = Thought70.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao1 != null){
      lb3 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - fd0;
    lb2 = !lb3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
    Output.points[0][1] -= fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    fb0 = fd1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    Thought lo0 = Thought45.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
    lb1 = ad3 < ad4;
    fb0 = fb1 || lb1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought97.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    Output.points[0][2] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    if (ab3) {
        Thought lo1 = Thought30.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
        ab2 = !ab3;
        ab4 = fd1 < fd0;
if(ao2 != null){
          fd1 = ao2.m3();
}
if(ao3 != null){
          ao3.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          fb0 = ao4.m2(fb1, ab1, ab2, ab3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ad1 *= -1;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    ab4 = fd1 > ad1;
    fb0 = ad2 > ad3;
    Output.points[0][3] -= ad4;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
        ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
}
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    if (ab2) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
        double ld2 = 366.1081931623351;
        ab3 = ld2 > ad1;
        Thought lo3 = Thought7.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
        double ld4 = 798.5611211336421;
        lb1 = fd0 < fd1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        double ld5 = 789.6992507764031;
if(fo1 != null){
          ld2 = fo1.m3(ld4, ld5, ad1, ad2);
}
        boolean lb6 = true;
        boolean lb7 = false;
        boolean lb8 = true;
        Output.points[0][4] -= ad3;
        ad4 = fd0 + fd1;
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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1();
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought20.getInstance(lb1, fb0, fb1, lb0);
        if (lb1) {
            fd0 = fd1 - fd0;
            fd1 = fd0 - fd1;
}}
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
    ab1 = fd1 < fd0;
    Thought lo0 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld1 = 78.61150885048833;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld1 = fd0 - fd1;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    double ld3 = 847.9233403432376;
    ld1 = ld3 - fd0;
    Thought lo4 = Thought94.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(fd1, ld1, ld3, fd0, fb0, fb1, lb2, ab1);
}
        ab2 = fd1 < ld1;
    Thought lo5 = Thought16.getInstance();
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld1, ld3);
}
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld1;
    lb2 = ab1 && ab2;
    if (ab3) {
        ld3 *= -1;
        fd0 = fd1 + ld1;
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
    fb0 = fb1 || fb0;
    ad1 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        boolean lb1 = true;
        lb1 = lb0 && fb0;
        ad4 *= -1;
        Thought lo2 = Thought11.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, lb0, fb0);
        Thought lo3 = Thought78.getInstance(fo1, fo0, fo1, fo0);
        fb1 = fd0 > fd1;
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
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][5] += fd1;
    ad1 *= -1;
    Thought lo0 = Thought55.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fb1 || ab1;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = ab1 && ab2;
    boolean lb2 = false;
    double ld3 = 760.5589657655011;
    ld3 = ad1 + ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = ld3 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, lb2, ab1);
}
    ld3 = ad1 - ad2;
    ad3 = ad4 - fd0;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    lb2 = fd1 > ld3;
    ad1 *= -1;

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
    double ld0 = 852.4278394721294;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought14.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && lb2;
    Thought lo3 = Thought40.getInstance(fb0, fb1, lb2, fb0);
    ld0 *= -1;
    fb1 = lb2 && fb0;
    double ld4 = 73.05917425403932;
    double ld5 = 378.3532745780336;
    boolean lb6 = false;
    ld4 = ld5 + fd0;
    Output.points[0][6] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld4, ld5, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, ld4, ld5, fd0, fb0, fb1, lb2, lb6);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, lb6);
}
    fb0 = fd1 > ld0;
    fb1 = ld4 > ld5;
    lb2 = lb6 || fb0;
    fb1 = !lb2;
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb7 = true;

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
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(ao3 != null){
      fd1 = ao3.m3();
}
    double ld2 = 417.33525374846295;
if(fo0 != null){
      ao4 = fo0.m4(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - ld2;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1, fb0, fb1, lb0, lb1);
}
    fb0 = ad2 > ad3;
    double ld3 = 291.7724120866628;
    ad3 = ad4 - fd0;
    fb1 = lb0 || lb1;

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
    double ld0 = 684.5978223478497;
    Thought lo1 = Thought52.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 - fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      ao4.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
    ab1 = ab2 && ab3;
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 - fd0;
    ab3 = fd1 < ld0;
    ab4 = !fb0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[0][7] -= fd0;
    fb1 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ld0 *= -1;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;

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
    Output.points[0][8] += ad1;
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    boolean lb2 = true;
    if (lb1) {
        lb2 = ab1 || ab2;
if(ao2 != null){
          ad2 = ao2.m3();
}
        ad3 *= -1;
        if (ab3) {
}}
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
    for(int i0=0; i0<10; i0++){
        }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    if (fb1) {
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
        boolean lb1 = true;
        lb1 = !fb0;
        fb1 = fd0 < fd1;
        lb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
        boolean lb2 = true;
        Thought lo3 = Thought60.getInstance(fo0, fo1, fo0, fo1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2(lb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab4 = !fb0;
    boolean lb2 = true;
    Thought lo3 = Thought27.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, lb4, ab1);
}
    ab2 = ab3 || ab4;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    double ld0 = 250.07558787292024;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought8.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || fb0;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
    ad4 = fd0 - fd1;
    Thought lo3 = Thought90.getInstance();
if(fo1 != null){
      fo1.m3(ld0, ad1, ad2, ad3);
}
    double ld4 = 897.2246172934393;
    fb1 = !lb2;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ld0;
    fb1 = lb2 && fb0;
if(fo0 != null){
      fo0.m3(fb1, lb2, fb0, fb1);
}
    double ld5 = 829.6631158783568;
    Thought lo6 = Thought38.getInstance(fo1, fo0, fo1, fo0, ld4, ld5, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    ld0 *= -1;
    boolean lb7 = true;

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
    Output.points[1][0] -= ad2;
    Output.points[1][1] -= ad3;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
    double ld0 = 693.2040500926171;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[1][2] += ad1;
    ab3 = ad2 > ad3;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    if (ab4) {
if(fo1 != null){
          fo1.m3(ld0, ad1, ad2, ad3);
}
        double ld1 = 828.6857062417663;
        ad3 = ad4 + fd0;
        Thought lo2 = Thought35.getInstance(fb0, fb1, ab1, ab2);
        fd1 = ld1 - ld0;
        } else {
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    Output.points[1][3] += fd1;
    boolean lb0 = true;
    fd0 *= -1;
    double ld1 = 675.6271295819101;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb2 = true;
if(fo1 != null){
      lb0 = fo1.m2(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0);
}
    boolean lb3 = true;
    lb2 = lb3 || fb0;
    fb1 = fd1 < ld1;
    Output.points[1][4] += fd0;
    fd1 = ld1 + fd0;
    lb0 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld0 = 147.03979539908195;
    Thought lo1 = Thought50.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    Output.points[1][5] += ad4;
    double ld2 = 782.391837980319;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ad4 *= -1;
    fb0 = fd0 > fd1;
    if (fb1) {
        boolean lb3 = true;
        ld0 = ld2 + ad1;
        lb3 = fb0 && fb1;
if(ao4 != null){
          ao4.m1(ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb3);
}
        boolean lb4 = false;
if(fo0 != null){
          lb4 = fo0.m2();
}
        fb0 = fb1 && lb3;
        fd1 *= -1;
        lb4 = !fb0;
        fb1 = lb3 && lb4;
if(fo1 != null){
          ld0 = fo1.m3(ld2, ad1, ad2, ad3);
}
if(ao1 != null){
          fb0 = ao1.m2(fb1, lb3, lb4, fb0);
}
        if (fb1) {
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
            if (lb3) {
}}}
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
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[1][6] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = !ab1;
    Output.points[1][7] -= fd0;
    ab2 = !ab3;
    Thought lo0 = Thought24.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
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
if(ao1 != null){
      ad4 = ao1.m3();
}
    boolean lb0 = false;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m3(ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought25.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
    ad1 *= -1;
    double ld2 = 514.6003272318356;
    boolean lb3 = true;
    lb3 = ab1 && ab2;

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
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought72.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m2();
}
    fd0 = fd1 - fd0;

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
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[1][8] += fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;

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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought48.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought37.getInstance();
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought27.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
