package genetic;
import java.util.ArrayList;
class Thought8 extends Thought{
private static ArrayList<Thought8> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 920.853647339203;
private double fd1 = 861.9611658663972;
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought2.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo3 = Thought8.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought7.getInstance(fo1, fo0, fo1, fo0);
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought12.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    if (lb2) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo3 = Thought16.getInstance();
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    if (fb1) {
        boolean lb0 = false;
        ad1 = ad2 - ad3;
        double ld1 = 426.63534319889993;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fb0 = ld1 < ad1;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ab1 = ad4 > fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab2 = fo1.m2();
}
        fd0 = fd1 - ad1;
        ad2 *= -1;
        double ld0 = 249.86423499722596;
        ab3 = ad2 > ad3;
        ab4 = !fb0;
        fb1 = ab1 && ab2;
        ab3 = ad4 < fd0;
        ab4 = fb0 && fb1;
        ab1 = !ab2;
        fd1 = ld0 + ad1;
        ab3 = ad2 < ad3;
        double ld1 = 485.1661619795635;
        ab4 = !fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        double ld2 = 331.3380978225558;
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
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    double ld0 = 299.20153125817086;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd1 = ld0 + fd0;
    fb0 = fb1 || fb0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    fb1 = fb0 && fb1;
    double ld0 = 545.3372773007401;
    fb0 = ad3 > ad4;
if(ao4 != null){
      ao4.m3();
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    double ld2 = 356.55298547980215;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ad1, ad2, ad3);
}
    double ld3 = 435.6354515844446;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    ld2 *= -1;
    ld3 = ad1 + ad2;
        lb1 = fb0 && fb1;

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
    ab1 = ab2 && ab3;
    if (ab4) {
        fb0 = fb1 || ab1;
if(ao2 != null){
          ab2 = ao2.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[8][8] += fd1;
        boolean lb0 = true;
        fd0 = fd1 + fd0;
        lb0 = ab1 || ab2;
        fd1 = fd0 - fd1;
        boolean lb1 = true;
        ab2 = fd0 > fd1;
        fd0 = fd1 + fd0;
        boolean lb2 = false;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
    ab4 = ad2 < ad3;
    Output.points[0][0] += ad4;
    boolean lb0 = false;
    boolean lb1 = true;
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 > ad4;
    fd0 *= -1;
        fd1 = ad1 - ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought8.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
    boolean lb3 = true;
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao2.m3(lb3, ab1, ab2, ab3);
}
    ab4 = !fb0;

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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 36.998246017650295;

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
        ab1 = !ab2;
    double ld0 = 508.1234819984348;
    ld0 = fd0 + fd1;
    Output.points[0][1] -= ld0;
    boolean lb1 = true;
    ab2 = fd0 < fd1;
    ld0 *= -1;
    ab3 = ab4 || fb0;
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
    double ld2 = 762.3462807354705;
    lb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, fd0, fd1);
}
    ld0 = ld2 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = !lb3;
if(fo1 != null){
      fo1.m1(fd1, ld0, ld2, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0);
}
    if (fb0) {
if(fo0 != null){
          fd1 = fo0.m3();
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb3, ab1, ab2);
}
        Thought lo4 = Thought18.getInstance(ab3, ab4, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    lb0 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    double ld1 = 700.2969997212062;
    ld1 *= -1;
    Thought lo2 = Thought7.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld1;
    Thought lo3 = Thought4.getInstance();
    boolean lb4 = false;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    if (lb0) {
if(fo0 != null){
          fo0.m3(lb4, ab1, ab2, ab3);
}
        Thought lo5 = Thought6.getInstance(ad2, ad3, ad4, fd0);
        ab4 = fb0 && fb1;
        lb0 = fd1 < ld1;
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb4 = ab1 || ab2;
        boolean lb6 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought6.getInstance();
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    Output.points[0][2] -= fd1;
    fb0 = fd0 > fd1;
    double ld2 = 787.0152814932159;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(lb1, fb0, fb1, lb1);
}
    fb0 = ld2 < fd0;
    fd1 = ld2 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld2, fd0, fd1, ld2);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;

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
    Output.points[0][3] += ad1;
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    fb0 = ad1 > ad2;
    boolean lb0 = true;
    double ld1 = 144.4537972368359;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought0.getInstance(fd1, ld1, ad1, ad2, fb1, lb0, fb0, fb1);
    ad3 *= -1;
    ad4 *= -1;
    Thought lo3 = Thought17.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
    ad2 *= -1;
    boolean lb4 = false;
    lb0 = ad3 < ad4;
    lb4 = fb0 && fb1;
    lb0 = !lb4;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb4);
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb0, lb4, fb0);
}
    fb1 = fd1 < ld1;
    Output.points[0][4] -= ad1;
    lb0 = !lb4;
    Thought lo5 = Thought19.getInstance(ad2, ad3, ad4, fd0);

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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought18.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;

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
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    boolean lb1 = true;
    boolean lb2 = false;
    ab4 = ad3 < ad4;
    fb0 = !fb1;
    lb0 = !lb1;
    fd0 *= -1;
    boolean lb3 = false;
if(ao3 != null){
      ao3.m1(fd1, ad1, ad2, ad3);
}
    lb2 = ad4 > fd0;
    fd1 = ad1 - ad2;
    Thought lo4 = Thought16.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    double ld5 = 316.8245207722851;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld5);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb2 = lb3 && ab1;
    ad1 *= -1;
    ad2 *= -1;
    boolean lb6 = false;
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, lb2);
}
    lb3 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld5, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
return lb6;
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
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[0][5] += fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[0][6] -= fd1;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought14.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    if (fb1) {
        fb0 = fb1 && fb0;
        Output.points[0][7] -= fd0;
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
    boolean lb0 = false;
    ab1 = !ab2;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb0;
    Output.points[0][8] -= fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought5.getInstance();
    Output.points[1][0] -= fd1;
    boolean lb3 = true;
    boolean lb4 = false;
    fd0 *= -1;
    Thought lo5 = Thought4.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb3, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    double ld6 = 86.9380268214874;
    lb1 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld6, fd0, lb4, ab1, ab2, ab3);
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
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
    double ld1 = 210.96356588756683;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
    ab1 = ab2 && ab3;
    Output.points[1][1] += ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
        ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    Output.points[1][2] += ad3;

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
    double ld0 = 348.0668091238463;
    Thought lo1 = Thought17.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ld0, fd0, fd1, ld0);
}
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    lb2 = !fb0;
    fd0 = fd1 + ld0;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = ld0 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
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
if(ao1 != null){
          ad1 = ao1.m3();
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought2.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ad1);
}
    double ld1 = 730.5444004808455;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 + ad4;
    fb1 = fb0 && fb1;

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
    ab1 = fd0 < fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[1][3] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought6.getInstance();
    ab3 = fd1 > fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;

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
        ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    fb1 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab1 = fd1 < ad1;
    ab2 = ab3 && ab4;
    ad2 = ad3 - ad4;
    double ld0 = 721.8753409681594;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought15.getInstance();
    double ld2 = 330.7222175189067;
    ab1 = ad1 < ad2;
    ad3 = ad4 - fd0;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Output.points[1][4] += fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    double ld0 = 734.3371963039871;

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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought0.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 *= -1;
    double ld1 = 52.23579272461385;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    Output.points[1][5] += fd0;
    fb1 = !ab1;
    Thought lo2 = Thought10.getInstance();
    Output.points[1][6] += fd1;

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
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2();
}
    fb0 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    double ld1 = 674.9590228894352;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - ld1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 - ld1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb1 = !ab1;
    double ld0 = 805.8333402226508;
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    fd0 = fd1 - ld0;
    fb1 = ab1 && ab2;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    ad4 *= -1;
        lb1 = lb2 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    ab2 = !ab3;
    double ld3 = 405.28098805602986;
    boolean lb4 = false;

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
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    Output.points[1][7] -= fd0;
    boolean lb1 = true;
    lb0 = fd1 > fd0;
    Output.points[1][8] -= fd1;
    fd0 *= -1;
    Output.points[2][0] -= fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    double ld2 = 997.8917856526544;
    boolean lb3 = true;
    fb0 = ld2 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1, fb1, lb0, lb1, lb3);
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
    fb1 = !fb0;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || lb0;
if(ao2 != null){
      fd0 = ao2.m3();
}
    fb0 = fb1 && lb0;
    Output.points[2][1] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao3.m2(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = fd0 > fd1;
    Thought lo0 = Thought12.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = false;
    ab2 = ab3 || ab4;
    fd1 *= -1;
    Output.points[2][2] -= fd0;
    Thought lo3 = Thought18.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb1;
    lb2 = ab1 && ab2;
    Output.points[2][3] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    double ld4 = 80.42584432841511;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = !lb2;
    ld4 = fd0 - fd1;
    Thought lo5 = Thought19.getInstance(ld4, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
    double ld6 = 404.7427145420817;
    ld6 = fd0 - fd1;
    ld4 = ld6 + fd0;

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
    ad2 = ad3 - ad4;
    Output.points[2][4] += fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m3();
}
    ad4 = fd0 - fd1;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo1 = Thought14.getInstance(lb0, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    lb0 = ad1 > ad2;

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
    fb1 = fb0 || fb1;
    Output.points[2][5] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought8.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, lb2, fb0);
}
    double ld3 = 459.3129696492643;
    fd0 = fd1 + ld3;

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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    double ld2 = 853.321089909269;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    Output.points[2][6] += fd0;
    fd1 = ld2 - fd0;
if(fo1 != null){
      lb0 = fo1.m2(lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > ld2;
    fb0 = !fb1;
    boolean lb3 = true;
    lb0 = lb1 && lb3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    fd1 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb0, lb1, lb3);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld2, fd0, fd1, fb1, lb0, lb1, lb3);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(lb1, lb3, fb0, fb1);
}
    Output.points[2][7] -= fd0;

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
