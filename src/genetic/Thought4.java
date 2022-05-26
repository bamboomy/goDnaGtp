package genetic;
import java.util.ArrayList;
class Thought4 extends Thought{
private static ArrayList<Thought4> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 449.4719210519098;
private double fd1 = 272.3394898223478;
private Thought fo0 = null;
private Thought fo1 = null;
Thought4 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought4 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought4 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought4 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought4 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought4 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought4 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought4 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought4 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[3][1] += fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought3.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    if (lb0) {
        lb1 = !fb0;
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
    ab2 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0);
}
        boolean lb0 = false;
        boolean lb1 = true;
        lb0 = lb1 && ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought9.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;

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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought1.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    boolean lb1 = false;
    if (fb0) {
        fb1 = !lb1;
        } else {
        ab1 = fd1 < ad1;
        boolean lb2 = true;
        ab1 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          ab2 = fo0.m2();
}
        Thought lo3 = Thought12.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
                  ad2 = fo1.m3(lb2, lb1, ab1, ab2);
}
        ad3 = ad4 - fd0;
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3();
}
    Thought lo0 = Thought5.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 + fd1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought16.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = ad3 < ad4;
        fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought7.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought5.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2(fb0, fb1, lb3, fb0);
}
    fd0 *= -1;
    Thought lo4 = Thought5.getInstance(fd1, ad1, ad2, ad3);
    double ld5 = 496.40157684502896;
    boolean lb6 = false;
    Thought lo7 = Thought3.getInstance(fo1, ao1, ao2, ao3);
    fb0 = fb1 && lb3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb6, fb0, fb1, lb3);
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = !ab2;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Output.points[3][2] -= fd1;
    boolean lb0 = true;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab4 = fd0 < fd1;
    ad1 *= -1;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao3.m1(fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    double ld1 = 713.7122068554245;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
    boolean lb2 = false;
    double ld3 = 615.571881737511;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ld3, ad1, ad2, ad3);
}
    Thought lo4 = Thought14.getInstance();

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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought2.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Output.points[3][3] -= fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[3][4] += fd1;
    boolean lb1 = true;
    Thought lo2 = Thought2.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    double ld4 = 438.00934351877294;

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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Output.points[3][5] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
        Output.points[3][6] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought17.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought4.getInstance();
    double ld3 = 748.9922344941737;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    fd0 *= -1;
    boolean lb4 = false;
    fd1 = ld3 + fd0;
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    fb0 = fd1 > ad1;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    double ld1 = 349.6499435643232;
    fb1 = lb0 || fb0;
    double ld2 = 484.50284384775534;
    fb1 = ad2 > ad3;
    boolean lb3 = true;
    boolean lb4 = true;
    boolean lb5 = false;
    Output.points[3][7] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, lb0, lb3, lb4, lb5);
}
        fb0 = fb1 && lb0;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb4 = fd0 < fd1;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ad1 > ad2;
    Output.points[3][8] += ad3;
    ab2 = ad4 > fd0;
    fd1 = ad1 + ad2;
    Output.points[4][0] += ad3;
    ad4 = fd0 - fd1;
    ab3 = ad1 < ad2;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
        ad1 *= -1;
        fb1 = lb0 && ab1;
        ab2 = ad2 < ad3;
        Thought lo1 = Thought8.getInstance(ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    lb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb1 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        Thought lo0 = Thought18.getInstance();
        boolean lb1 = true;
        boolean lb2 = true;
        fd0 = fd1 + ad1;
        lb2 = ad2 < ad3;
        fb0 = ad4 < fd0;
        fd1 *= -1;
        fb1 = ad1 < ad2;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, lb1, lb2, fb0, fb1);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    boolean lb3 = false;
    fb0 = ad3 > ad4;
    double ld4 = 637.2325629556277;
    Output.points[4][1] -= ad4;
    fb1 = !lb3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fd0 > fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld4, ad1, ad2, ad3, lb3, fb0, fb1, lb3);
}
    ad4 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought2.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao2.m1();
}
    fd0 = fd1 - fd0;

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
    Thought lo0 = Thought14.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[4][2] += ad1;
    ad2 = ad3 - ad4;
    double ld1 = 75.56588944082523;
    fb1 = !ab1;
    Output.points[4][3] -= ad4;
    fd0 = fd1 + ld1;
    ad1 *= -1;
        ad2 = ad3 + ad4;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    if (fb0) {
        Thought lo2 = Thought17.getInstance(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2);
if(fo1 != null){
          fo1.m3();
}
        ad3 = ad4 + fd0;
        fd1 = ld1 - ad1;
        boolean lb3 = true;
        Thought lo4 = Thought11.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb3, ab1);
        if (ab2) {
            Thought lo5 = Thought16.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
              fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
}}
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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    fb1 = !lb0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    lb2 = fd0 < fd1;

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
    double ld0 = 10.907848085262158;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[4][4] -= fd1;
    Thought lo1 = Thought5.getInstance(fb0, fb1, ab1, ab2);
    Thought lo2 = Thought6.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
    Output.points[4][5] += fd1;
    Thought lo3 = Thought8.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    boolean lb0 = false;
    lb0 = !fb0;
    ad2 *= -1;
    if (fb1) {
        double ld1 = 757.8139716509123;
        for(int i0=0; i0<10; i0++){
            lb0 = ad2 > ad3;
            double ld2 = 441.8706243337167;
            fb0 = fb1 || lb0;
            }
        fb0 = ad4 < fd0;
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought8.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[4][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, ab1, ab2);
}
    ab3 = ad1 < ad2;
    ab4 = fb0 && fb1;
    double ld2 = 699.1700175067681;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    lb1 = ld2 < ad1;
    Thought lo3 = Thought1.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fd1, ld2, ad1, ad2, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld2 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ab3 = fd0 < fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3(lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        lb0 = fb0 || fb1;
        double ld2 = 427.0935331863107;
        Thought lo3 = Thought8.getInstance(ld2, fd0, fd1, ld2);
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        fd0 *= -1;
        Output.points[4][7] -= fd1;
        lb1 = lb0 || fb0;
        fb1 = lb1 && lb0;
        ld2 = fd0 - fd1;
        boolean lb4 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, lb0, fb0, fb1, lb1);
}
        Output.points[4][8] += fd0;
if(ao1 != null){
          ao1.m3(fd1, ld2, fd0, fd1, lb4, lb0, fb0, fb1);
}
        Thought lo5 = Thought12.getInstance(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
        lb1 = !lb4;
        lb0 = !fb0;
        Output.points[5][0] -= fd0;
        fd1 *= -1;
        Thought lo6 = Thought7.getInstance();
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb1, lb4, lb0);
}
if(fo1 != null){
          ld2 = fo1.m3(fb0, fb1, lb1, lb4);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld2, fd0);
}
        lb0 = fd1 < ld2;
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
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
    boolean lb2 = true;
    ad1 *= -1;
    boolean lb3 = true;
    if (lb2) {
        Thought lo4 = Thought15.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
          lb3 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
          lb0 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    double ld1 = 477.496641406198;
        boolean lb2 = false;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought2.getInstance(lb2, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
    fb0 = ld1 < fd0;
    fd1 = ld1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld1, fd0, fd1, ld1);
}
    fb1 = fd0 < fd1;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo4 = Thought8.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, lb0, lb2, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld1 + fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld5 = 640.654884870293;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb0, lb2, ab1, ab2);
}
            if (ab3) {
        ab4 = !fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[5][1] += ad2;
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    Output.points[5][2] -= fd1;
    ad1 = ad2 - ad3;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    Thought lo2 = Thought8.getInstance(ad4, fd0, fd1, ad1);
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb3 = true;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    double ld0 = 380.11938615846964;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
        fb0 = ld0 > fd0;
        fb1 = !lb1;
        double ld2 = 166.12627919478825;
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
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought4.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[5][3] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    double ld2 = 505.54459136787693;
    double ld3 = 41.44998329082782;
    boolean lb4 = true;
    fb0 = ld2 > ld3;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld2, ld3, fb1, lb0, lb4, ab1);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 = ld2 - ld3;
        ab2 = ab3 && ab4;
        fb0 = !fb1;
        lb0 = !lb4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3);
}
        ab1 = ab2 && ab3;
        fd0 *= -1;
        ab4 = fd1 > ld2;
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
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = ad2 > ad3;
    Thought lo0 = Thought11.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    if (fb1) {
        fb0 = fb1 && fb0;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        double ld1 = 147.22413727562852;
        fb0 = fb1 || fb0;
        ad4 *= -1;
        boolean lb2 = false;
        fb0 = fb1 || lb2;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
        boolean lb3 = false;
        Output.points[5][4] += ld1;
        lb2 = ad1 > ad2;
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        if (fb0) {
            } else if (fb1) {
            lb2 = lb3 || fb0;
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
if(fo1 != null){
      ad1 = fo1.m3();
}
    double ld0 = 278.00848347943906;
    ab2 = ab3 && ab4;
    ad1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    Thought lo2 = Thought6.getInstance(ab2, ab3, ab4, fb0);
    boolean lb3 = true;
    fb0 = !fb1;
    double ld4 = 658.9676875113163;
    lb1 = lb3 && ab1;
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo5 = Thought12.getInstance(fo0, fo1, fo0, fo1, ld0, ld4, ad1, ad2, ab3, ab4, fb0, fb1);

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
    boolean lb0 = true;
    double ld1 = 711.2782290354813;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
if(ao2 != null){
      lb0 = ao2.m2(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    ld1 *= -1;
    Thought lo3 = Thought14.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
    boolean lb4 = true;
if(ao1 != null){
      fd1 = ao1.m3();
}
    lb0 = lb2 && lb4;
    fb0 = !fb1;
    double ld5 = 586.9286197909206;
    lb0 = lb2 && lb4;
    fb0 = fb1 && lb0;
    lb2 = lb4 && fb0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb2, lb4);
}
        ld1 = ld5 - fd0;
        fd1 *= -1;
        boolean lb6 = true;
        lb4 = ld1 > ld5;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 *= -1;
    fb0 = fb1 && fb0;
        fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fb1 = !fb0;
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = !fb0;

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
    ab2 = ab3 && ab4;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought2.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    if (ab2) {
if(ao1 != null){
          ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < ad1;
        ad2 = ad3 - ad4;
        ab2 = ab3 || ab4;
        boolean lb0 = true;
        ab4 = fd0 < fd1;
        fb0 = fb1 || lb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab1 = ab2 && ab3;
        Output.points[5][5] += fd0;
        Output.points[5][6] += fd1;
        ab4 = !fb0;
        boolean lb1 = false;
        Thought lo2 = Thought12.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
        Output.points[5][7] -= ad1;
        ab1 = ab2 || ab3;
        boolean lb3 = true;
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
    Output.points[5][8] += fd1;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 515.8880412891449;
    Thought lo2 = Thought3.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
        fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
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
    Output.points[6][0] -= fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 762.8544343747119;
    Thought lo1 = Thought19.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    double ld2 = 216.17347282309075;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
        fb0 = ld2 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
    fd1 = ld0 + ld2;
    lb3 = fb0 || fb1;
if(fo1 != null){
      lb3 = fo1.m2(fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ld2);
}
        fd0 = fd1 + ld0;
    ld2 = fd0 - fd1;
    boolean lb4 = false;
    ld0 = ld2 + fd0;
        Thought lo5 = Thought6.getInstance(fo1, fo0, fo1, fo0);

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
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    fd1 *= -1;
    fb1 = !lb0;
    Thought lo2 = Thought13.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    fd0 *= -1;
    Thought lo3 = Thought6.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Output.points[6][1] -= fd1;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = false;
    Thought lo5 = Thought19.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, lb4, fb0);
    boolean lb6 = true;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd0 = fo1.m3(lb1, lb4, lb6, fb0);
}
    boolean lb7 = true;

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
