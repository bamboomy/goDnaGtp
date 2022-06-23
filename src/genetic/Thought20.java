package genetic;
import java.util.ArrayList;
class Thought20 extends Thought{
private static ArrayList<Thought20> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 312.71889718630774;
private double fd1 = 558.9306571218398;
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    if (lb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fd0 > fd1;
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fb0 = !fb1;
        fd1 = fd0 + fd1;
        Output.points[2][3] += fd0;
        lb0 = fd1 > fd0;
        fb0 = !fb1;
        lb0 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
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
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought47.getInstance();
    Output.points[2][4] -= fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought33.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);

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
    Thought lo0 = Thought73.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1();
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    boolean lb1 = false;
    Output.points[2][5] -= ad4;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    fb1 = ad1 > ad2;
    double ld2 = 653.1371247944614;
    ad2 = ad3 + ad4;
    lb1 = !fb0;
    Thought lo3 = Thought46.getInstance(fd0, fd1, ld2, ad1);
    fb1 = !lb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    lb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
    boolean lb4 = true;
    boolean lb5 = false;

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
if(fo0 != null){
      fo0.m3();
}
    Thought lo0 = Thought12.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    ab3 = ab4 && fb0;
    if (fb1) {
        lb1 = ab1 || ab2;
        ad2 = ad3 - ad4;
        boolean lb2 = true;
        double ld3 = 900.1263165613328;
        ad4 = fd0 + fd1;
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
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought7.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    Output.points[2][6] -= fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    fb0 = !fb1;
    boolean lb2 = false;
    lb1 = fd1 > fd0;
    boolean lb3 = false;
    lb2 = fd1 < fd0;
    lb3 = !fb0;
    fb1 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ad1 = ao3.m3();
}
        fb0 = fb1 || fb0;
        ad2 *= -1;
if(ao4 != null){
          fb1 = ao4.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
        Output.points[2][7] += ad1;
        double ld0 = 326.96093522475525;
        fb1 = !fb0;
        fb1 = fb0 && fb1;
        ad1 = ad2 + ad3;
        boolean lb1 = true;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    ab1 = !ab2;
    fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
    if (ab4) {
if(ao3 != null){
          ao3.m2();
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
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 435.24598600073807;
    fb0 = fd0 > fd1;
    ld0 = ad1 - ad2;
    fb1 = ad3 < ad4;
    boolean lb1 = false;
    fd0 = fd1 - ld0;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
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
    boolean lb0 = false;
    fd0 *= -1;
    Thought lo1 = Thought93.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;
    lb0 = lb2 || fb0;
    Thought lo3 = Thought19.getInstance();
    fb1 = lb0 && lb2;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb2, lb4, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb2, lb4, fb0);
}
    Thought lo5 = Thought97.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb6 = true;
    Thought lo7 = Thought19.getInstance(fb0, fb1, lb0, lb2);
    lb4 = !lb6;

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
          fo0 = fo1.m4();
}
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    Output.points[2][8] -= fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought0.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    double ld3 = 989.6656667542222;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ld3 - fd0;
    fd1 = ld3 - fd0;
    lb1 = fd1 > ld3;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 474.70126698286396;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    Thought lo1 = Thought1.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    Thought lo3 = Thought70.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ab3 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][0] += fd0;
    Thought lo0 = Thought10.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought92.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    boolean lb2 = false;
    fb0 = fb1 && lb2;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
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
        Thought lo0 = Thought88.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        double ld1 = 530.4361080868645;
        boolean lb2 = false;
        ad2 = ad3 + ad4;
        Thought lo3 = Thought3.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, lb2, fb0);
        ad2 = ad3 + ad4;
        Output.points[3][1] += fd0;
        double ld4 = 619.9463990965718;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Thought lo5 = Thought53.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld4, fb1, lb2, fb0, fb1);
if(ao2 != null){
          lb2 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 && fb0;
        ad1 = ad2 - ad3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || ab1;
    ab2 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Output.points[3][2] += fd1;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    ab3 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought14.getInstance(ao2, ao3, ao4, fo0);
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, lb1, lb3, ab1);
}
    boolean lb4 = false;
    ab1 = ab2 && ab3;
    Thought lo5 = Thought28.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
    Output.points[3][3] -= fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    Output.points[3][4] -= ad2;
    double ld1 = 388.6893692638821;
    lb0 = ad2 < ad3;
    ab1 = ad4 > fd0;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2);
}
        boolean lb2 = false;
    ad3 *= -1;
    boolean lb3 = false;
    boolean lb4 = false;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
        lb0 = lb2 && lb3;
    ad4 *= -1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        lb0 = fb0 && fb1;
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
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = fd0 > fd1;
    Thought lo0 = Thought83.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][5] -= fd0;
    ab4 = fb0 && fb1;
    fd1 *= -1;

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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    Thought lo1 = Thought31.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    boolean lb2 = true;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld3 = 302.1924044697646;

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
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    fb1 = ab1 && ab2;
    double ld0 = 303.0782238170582;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab3 = fo1.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ld0 *= -1;
    Thought lo1 = Thought52.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ld0 = ad1 + ad2;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[3][6] += ld0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m2();
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    double ld1 = 429.97948383586646;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
        fd0 = fd1 - ld1;

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
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[3][7] -= ad2;
    ad3 = ad4 + fd0;
    Output.points[3][8] -= fd1;
        fb1 = ad1 < ad2;
    Output.points[4][0] -= ad3;
    ad4 = fd0 - fd1;
    double ld0 = 247.63945059693702;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 533.6780057494591;
    lb0 = !ab1;
    fd0 = fd1 - ld1;
    if (ab2) {
        ab3 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        Thought lo2 = Thought55.getInstance(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb3);
}
        ld1 *= -1;
        } else if (ab1) {
        ab2 = fd0 > fd1;
        boolean lb4 = true;
        ld1 = fd0 - fd1;
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
if (false) { throw new CountDownExc(-1); }
    double ld0 = 535.1985583504314;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    double ld1 = 612.2205858551907;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ad1);
}
    fb1 = lb2 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, ld1, ad1, ab4, fb0, fb1, lb2);
}
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought38.getInstance(ad4, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fb1, lb2, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = ab4 && fb0;
    if (fb1) {
        lb2 = !ab1;
        ab2 = fd0 < fd1;
        boolean lb4 = true;
        ab2 = ld0 > ld1;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        lb4 = !lb2;
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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[4][1] += fd0;
    fd1 *= -1;
    Thought lo0 = Thought6.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 && fb0;
    Thought lo1 = Thought53.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    if (fb1) {
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Output.points[4][2] += fd1;
        fd0 *= -1;
        fb1 = fd1 < fd0;
        boolean lb2 = false;
        Thought lo3 = Thought93.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
        if (fb0) {
            fd1 = fd0 - fd1;
            fd0 *= -1;
            fd1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
            fb1 = lb2 || fb0;
            fd0 = fd1 - fd0;
            double ld4 = 488.05214542760825;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;
    Output.points[4][3] -= fd0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
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
    double ld0 = 371.2738048513933;
    Output.points[4][4] -= ld0;
    ad1 *= -1;
    boolean lb1 = true;
    double ld2 = 624.1793350103917;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    ld0 = ld2 - ad1;
    ad2 *= -1;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
    ld0 *= -1;
    fb1 = !lb1;
    ld2 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    Thought lo3 = Thought9.getInstance(fo1, fo0, fo1, fo0);
    Output.points[4][5] += ld0;
    fb1 = lb1 && fb0;

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
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought0.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = ab1 && ab2;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
    fd1 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fd0 *= -1;
        fd1 = fd0 - fd1;
    Thought lo1 = Thought70.getInstance(fb0, fb1, lb0, fb0);
if(ao1 != null){
      ao1.m3();
}
    Output.points[4][6] += fd0;
    boolean lb2 = false;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    lb2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    double ld3 = 3.853985775964428;
    if (lb2) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Thought lo4 = Thought24.getInstance(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
        fb0 = fb1 || lb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb0);
}
        Thought lo5 = Thought7.getInstance(fd0, fd1, ld3, fd0);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld3, fd0, fd1);
}
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
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    double ld0 = 782.8724519593591;
    boolean lb1 = true;
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld0, ad1, fb1, lb1, fb0, fb1);
}
    lb1 = ad2 > ad3;
    fb0 = !fb1;
    Thought lo2 = Thought97.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    ad1 *= -1;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
}
    lb4 = fb0 && fb1;
    ad3 *= -1;
    lb1 = lb3 && lb4;
    fb0 = fb1 && lb1;

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
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[4][7] += fd0;
    boolean lb0 = false;
    double ld1 = 322.84586339645;
    if (lb0) {
        Thought lo2 = Thought52.getInstance();
        ab1 = ab2 || ab3;
        fd0 = fd1 - ld1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][8] -= ad2;
    Output.points[5][0] += ad3;
    Thought lo0 = Thought27.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    double ld1 = 135.9172045406786;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    fd1 = ld1 + ad1;

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
    fb1 = fb0 && fb1;
        Thought lo0 = Thought61.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought24.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    double ld2 = 847.1407288914214;
    fb0 = fd0 < fd1;
    Output.points[5][1] += ld2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought67.getInstance(fd1, ld2, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    lb3 = fb0 || fb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(lb3, fb0, fb1, lb3);
}
    ld2 = fd0 - fd1;

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
    Thought lo0 = Thought45.getInstance();
    Thought lo1 = Thought44.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
        fd0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld3 = 588.9047500588259;
    Thought lo4 = Thought13.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);

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
    Thought lo0 = Thought65.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought18.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
    Thought lo4 = Thought66.getInstance(fo0, fo1, fo0, fo1);
    Thought lo5 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
    lb2 = lb3 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, lb3, fb0);
}
    Thought lo6 = Thought88.getInstance(fd0, fd1, fd0, fd1);
    boolean lb7 = true;
    double ld8 = 437.2078578722074;
    double ld9 = 414.18773642642776;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld8, ld9, fd0, fd1);
}
if(fo0 != null){
      ld8 = fo0.m3(fb0, fb1, lb2, lb3);
}
    ld9 *= -1;
    lb7 = !fb0;
    fd0 = fd1 + ld8;

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
