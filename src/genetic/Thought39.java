package genetic;
import java.util.ArrayList;
class Thought39 extends Thought{
private static ArrayList<Thought39> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 992.6607662242136;
private double fd1 = 620.6236389595936;
private Thought fo0 = null;
private Thought fo1 = null;
Thought39 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought39 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought39 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought39 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought39 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m2(fb1, fb0, fb1, fb0);
}
    Output.points[3][4] -= fd0;
    Thought lo0 = Thought17.getInstance();
    double ld1 = 452.41531018432846;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][5] -= fd1;
    Thought lo2 = Thought2.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
    double ld3 = 325.76665675628044;
        ld3 = fd0 + fd1;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}
    fb1 = ld1 > ld3;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought65.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
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
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    Thought lo0 = Thought59.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fd0 *= -1;
        fd1 = ad1 - ad2;
        fb1 = ad3 > ad4;
        fb0 = fb1 || fb0;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
        fd0 = fd1 + ad1;
        ad2 *= -1;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
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
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb0 = fo0.m2(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
        lb0 = ad2 < ad3;
        ad4 *= -1;
if(fo1 != null){
          fo1.m3();
}
        for(int i1=0; i1<10; i1++){
            boolean lb2 = false;
            lb0 = fd0 > fd1;
            }
        Thought lo3 = Thought64.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
        fb0 = fb1 || lb0;
        fd0 = fd1 + ad1;
        ad2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        if (lb1) {
            ab1 = ab2 || ab3;
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
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Output.points[3][6] -= fd0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    Output.points[3][7] -= fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fd0 = ao1.m3(fb1, lb0, fb0, fb1);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        fd1 *= -1;
        Thought lo1 = Thought39.getInstance();
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        lb0 = fd0 > fd1;
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
    Thought lo0 = Thought39.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad1 < ad2;
    boolean lb1 = true;
    lb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 *= -1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ad1 = ad2 + ad3;
        double ld2 = 632.6206703164976;

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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought36.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought59.getInstance(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
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
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ad1 = ao4.m3();
}
    Output.points[3][8] += ad2;
    Thought lo0 = Thought68.getInstance(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    boolean lb1 = false;
    boolean lb2 = false;
    ab2 = !ab3;
    double ld3 = 248.1632322973881;
    double ld4 = 372.4710448990651;
    ab4 = !fb0;
    fb1 = lb1 && lb2;
    ld3 *= -1;
    Thought lo5 = Thought16.getInstance(fo0, fo1, ao1, ao2);
    ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ld4, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
}
    ab1 = !ab2;
    ab3 = ad4 > fd0;
    if (ab4) {
        fb0 = fb1 && lb1;
        fd1 *= -1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought2.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought75.getInstance();
    Output.points[4][0] -= fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    boolean lb2 = true;
    fb0 = fd1 < fd0;
        fd1 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought45.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
}
    fd0 *= -1;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[4][1] -= fd1;
if(fo1 != null){
      fo1.m1(lb5, fb0, fb1, lb2);
}
    Output.points[4][2] += fd0;
    lb3 = fd1 < fd0;
    lb5 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;

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
    boolean lb0 = false;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought46.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld2 = 763.4680368018504;
    Thought lo3 = Thought40.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    lb0 = !ab1;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][3] += ad1;
    double ld0 = 242.7103213960396;
    Thought lo1 = Thought52.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
    double ld2 = 501.61282921032597;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ld2 = ad1 + ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ld0 > ld2;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
    fb0 = fb1 || lb3;
        boolean lb4 = true;
if(fo0 != null){
      lb4 = fo0.m2();
}
    Thought lo5 = Thought25.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb3, lb4);
    fb0 = fb1 || lb3;
    lb4 = fd0 < fd1;
    ld0 *= -1;
    boolean lb6 = false;
    ld2 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    boolean lb0 = false;
    Output.points[4][4] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
    double ld1 = 272.815606796129;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    Output.points[4][5] -= fd1;
    boolean lb1 = false;
    if (lb1) {
        fb0 = fd0 < fd1;
        Output.points[4][6] += fd0;
if(ao4 != null){
          fd1 = ao4.m3();
}
        boolean lb2 = true;
        for(int i0=0; i0<10; i0++){
            fd0 *= -1;
            fd1 *= -1;
            fb0 = fd0 > fd1;
            fb1 = lb2 || lb0;
            Thought lo3 = Thought38.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb2);
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            boolean lb4 = false;
            lb2 = lb0 && lb1;
if(fo0 != null){
              fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb4, lb2);
}
            Thought lo5 = Thought5.getInstance(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
if(ao2 != null){
              ao2.m1(fd1, fd0, fd1, fd0);
}
            double ld6 = 47.59335009698064;
            Output.points[4][7] += fd0;
            fd1 = ld6 + fd0;
            fd1 = ld6 + fd0;
if(ao3 != null){
              lb4 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld6, fd0, fd1);
}
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought90.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    if (fb0) {
        Thought lo1 = Thought3.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        fd0 = fd1 + ad1;
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought37.getInstance(ad3, ad4, fd0, fd1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        Output.points[4][8] += fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    Thought lo0 = Thought90.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    fd1 *= -1;
    ab4 = fb0 && fb1;
    double ld1 = 724.5190622685009;
    ab1 = ab2 && ab3;
    Thought lo2 = Thought70.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    fb1 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    ld1 *= -1;
if(ao3 != null){
      fd0 = ao3.m3();
}
if(ao4 != null){
      ao4.m3(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Thought lo3 = Thought50.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld4 = 712.1014169778224;

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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
    ad4 *= -1;
    if (ab2) {
        boolean lb0 = false;
        double ld1 = 69.55733370064019;
        boolean lb2 = false;
        for(int i0=0; i0<10; i0++){
            double ld3 = 56.26933603013591;
            ab1 = !ab2;
if(ao1 != null){
              ab3 = ao1.m2(ad3, ad4, fd0, fd1);
}
            Thought lo4 = Thought87.getInstance(ao2, ao3, ao4, fo0, ld3, ld1, ad1, ad2);
            ab4 = fb0 || fb1;
            lb0 = !lb2;
            ab1 = ab2 && ab3;
            double ld5 = 685.0619531206493;
            ab4 = !fb0;
            double ld6 = 313.911010537581;
if(fo1 != null){
              fo1.m1(fb1, lb0, lb2, ab1);
}
}}
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
        Output.points[5][0] += fd0;
    Thought lo0 = Thought88.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought78.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    Thought lo2 = Thought82.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[5][1] += fd1;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
        fb1 = ab1 || ab2;
        ab3 = !ab4;
        double ld0 = 378.2224880899728;
        boolean lb1 = true;
        Output.points[5][2] += fd0;
        boolean lb2 = true;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fd1, ld0, fd0, fd1);
}
        lb1 = ld0 > fd0;
        fd1 = ld0 + fd0;
        boolean lb3 = true;
        Output.points[5][3] += fd1;
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought67.getInstance(fb0, fb1, lb0, fb0);
    Thought lo2 = Thought10.getInstance();
    ad3 *= -1;
    fb1 = lb0 && fb0;
    if (fb1) {
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        lb0 = ad3 < ad4;
        Output.points[5][4] -= fd0;
        fd1 *= -1;
        ad1 = ad2 + ad3;
        double ld3 = 653.5448892176338;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
    boolean lb0 = false;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[5][5] -= ad2;
    fb1 = ad3 < ad4;

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
    Output.points[5][6] -= fd1;
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 925.0227315670045;
if(ao4 != null){
      ld0 = ao4.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
        boolean lb1 = false;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
          ld0 = ao3.m3(fd0, fd1, ld0, fd0);
}
        Output.points[5][7] += fd1;
if(ao4 != null){
          ld0 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 + fd0;
        fd1 *= -1;
        fb1 = !lb1;
        Output.points[5][8] += ld0;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
        Thought lo2 = Thought5.getInstance();
        fd0 *= -1;
        boolean lb3 = true;
        Output.points[6][0] -= fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    lb0 = !fb0;
    Thought lo1 = Thought46.getInstance(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought42.getInstance(ao1, ao2, ao3, ao4);
    lb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = ad3 < ad4;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
        lb0 = ad2 < ad3;
if(fo0 != null){
          fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
        fb0 = fd1 > ad1;
        if (fb1) {
            ad2 = ad3 - ad4;
            lb0 = !fb0;
            Output.points[6][1] += fd0;
if(ao2 != null){
              ao1 = ao2.m4();
}
if(ao4 != null){
              ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
            lb0 = ad4 < fd0;
            Output.points[6][2] -= fd1;
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        boolean lb0 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao3.m3(fb0, fb1, lb0, ab1);
}
        for(int i0=0; i0<10; i0++){
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 829.8125469421607;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought6.getInstance();
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 < ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo2 = Thought24.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || ab1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
    Thought lo3 = Thought44.getInstance(ab2, ab3, ab4, fb0);

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
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    double ld0 = 913.2639966902079;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought12.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    double ld2 = 231.95555739259152;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    lb0 = !ab1;
    ab2 = !ab3;
    ab4 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought24.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    Thought lo2 = Thought38.getInstance(fd1, fd0, fd1, fd0);
    lb0 = fd1 > fd0;
    double ld3 = 311.5551238799058;
    fd0 = fd1 + ld3;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    ld3 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      ab2 = fo0.m2(ld3, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    double ld1 = 610.2498623531112;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = ld1 > ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
    boolean lb2 = true;
    ad3 = ad4 - fd0;

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
    double ld0 = 745.1564842893339;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 = ld0 + ad1;
    ad2 *= -1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[6][3] += ld0;
    ad1 = ad2 - ad3;
    ab3 = ab4 || fb0;
    Output.points[6][4] -= ad4;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ld0 = fo0.m3(ad1, ad2, ad3, ad4);
}
    double ld1 = 593.4526862630189;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    fb0 = !fb1;
    ld1 *= -1;
    ab1 = ab2 && ab3;
    boolean lb2 = false;
    Output.points[6][5] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
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
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought77.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ao1.m3();
}
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb2 = true;
    lb2 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, lb0, lb2, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    Thought lo3 = Thought27.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    Output.points[6][6] -= fd1;
    lb0 = lb2 || fb0;

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
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    if (fb1) {
if(ao3 != null){
          ad1 = ao3.m3();
}
        Thought lo0 = Thought34.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        double ld1 = 827.330352328763;
        fd0 *= -1;
        fb0 = fb1 || fb0;
        boolean lb2 = false;
        boolean lb3 = false;
        boolean lb4 = true;
        fd1 = ld1 - ad1;
        lb3 = lb4 && fb0;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        Output.points[6][7] -= ad2;
        ad3 *= -1;
        boolean lb5 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, lb2, lb3, lb4, lb5);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb2, lb3);
}
if(ao2 != null){
          ao2.m3(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        fd1 = ld1 - ad1;
        lb4 = ad2 > ad3;
        lb5 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1);
}
if(ao4 != null){
          ao3 = ao4.m4(lb2, lb3, lb4, lb5);
}
        fb0 = ad1 < ad2;
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
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo0 = Thought98.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought39.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
    ab2 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab3 = fd1 < fd0;
    ab4 = fd1 < fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    fd1 = ad1 + ad2;
    ab2 = ab3 && ab4;
    boolean lb0 = false;
if(ao3 != null){
      ad3 = ao3.m3();
}
if(ao4 != null){
      ab4 = ao4.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    ab2 = ad2 > ad3;
    Thought lo1 = Thought58.getInstance(fo0, fo1, ao1, ao2);
    ab3 = ad4 > fd0;
    fd1 = ad1 + ad2;
    Thought lo2 = Thought89.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
    ab1 = ab2 && ab3;
        ad1 = ad2 - ad3;
    ad4 *= -1;
    ab4 = !fb0;
    Thought lo3 = Thought94.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
    fd0 *= -1;
    ab3 = fd1 < ad1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    lb0 = ab1 && ab2;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

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
          fo0.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 184.03592794683826;
if(fo1 != null){
      fb0 = fo1.m2();
}
    Output.points[6][8] += ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    double ld1 = 590.5190302001523;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    boolean lb2 = true;

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
    Thought lo0 = Thought62.getInstance(fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = lb2 || fb0;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][0] -= fd1;
    Thought lo3 = Thought23.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, lb2, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    lb1 = !lb2;
    Output.points[7][1] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m2();
}
        Output.points[7][2] += fd0;
    Thought lo1 = Thought44.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought7.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < fd0;
    boolean lb3 = false;
    lb3 = !fb0;
    boolean lb4 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
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
}
