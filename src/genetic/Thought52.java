package genetic;
import java.util.ArrayList;
class Thought52 extends Thought{
private static ArrayList<Thought52> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 18.243718643955265;
private double fd1 = 532.0362311501802;
private Thought fo0 = null;
private Thought fo1 = null;
Thought52 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought52 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought52 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought52 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought52 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = !lb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld2 = 215.77792185255797;
    Thought lo3 = Thought275.getInstance(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
    fb0 = fd0 > fd1;
    fb1 = ld2 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1();
}
        boolean lb4 = true;
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
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = ab1 || ab2;
    if (ab3) {
        Output.points[3][6] -= fd1;
if(fo0 != null){
          fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab3 = !ab4;
        boolean lb0 = false;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        Output.points[3][7] += fd0;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        boolean lb1 = true;
        ab4 = !fb0;
        fb1 = fd1 < fd0;
        lb0 = !lb1;
        double ld2 = 967.4694778704124;
        Thought lo3 = Thought374.getInstance(fd0, fd1, ld2, fd0, ab1, ab2, ab3, ab4);
        fb0 = fd1 < ld2;
        fb1 = lb0 || lb1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought143.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fd0 = fd1 - ad1;
    fb0 = !fb1;
    boolean lb2 = true;
if(fo0 != null){
      ad2 = fo0.m3(lb0, lb2, fb0, fb1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb0 = !lb2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb0);
}
    boolean lb4 = true;
    fd0 *= -1;
    boolean lb5 = true;
    fd1 = ad1 - ad2;
    boolean lb6 = true;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[3][8] -= ad1;
    ad2 = ad3 - ad4;
    ab1 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        lb0 = ad4 < fd0;
        boolean lb2 = true;
        Thought lo3 = Thought213.getInstance(fo0, fo1, fo0, fo1);
        Output.points[4][0] -= fd1;
        ad1 = ad2 + ad3;
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
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    double ld1 = 636.0415253619001;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb0);
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
    Thought lo0 = Thought144.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    fb0 = !fb1;
    double ld1 = 557.8576853047178;
if(ao4 != null){
      ao4.m2(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
    double ld2 = 875.5789580954113;

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
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought225.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
    ab4 = fb0 || fb1;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
        fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, lb2, lb3, ab1, ab2);
}
    fd1 *= -1;
    Output.points[4][1] -= fd0;
    double ld4 = 613.535927593268;
if(fo0 != null){
      ao4 = fo0.m4();
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
    boolean lb0 = true;
    Output.points[4][2] += ad2;
    ab1 = ad3 < ad4;
    ab2 = ab3 || ab4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      ao1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought291.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    fb1 = lb0 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
    ab3 = ad2 > ad3;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        double ld0 = 849.1825198680237;
        fb0 = fd0 < fd1;
        boolean lb1 = true;
        boolean lb2 = true;
        lb2 = !fb0;
        Output.points[4][3] -= ld0;
        double ld3 = 873.064282462124;
        fb1 = !lb1;
        Output.points[4][4] += ld3;
        lb2 = !fb0;
        Thought lo4 = Thought81.getInstance(fd0, fd1, ld0, ld3, fb1, lb1, lb2, fb0);
        fd0 = fd1 - ld0;
if(fo1 != null){
          ld3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, fb1, lb1, lb2, fb0);
}
        Thought lo5 = Thought370.getInstance(fb1, lb1, lb2, fb0);
        boolean lb6 = false;
        boolean lb7 = false;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
        lb7 = fd1 < ld0;
        fb0 = !fb1;
        Thought lo8 = Thought61.getInstance(ld3, fd0, fd1, ld0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought203.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fd1 *= -1;
    Output.points[4][5] -= fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    ad2 *= -1;
        ad3 = ad4 - fd0;
    Thought lo0 = Thought70.getInstance(fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    ad4 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3();
}
    fb0 = fd0 < fd1;
    double ld2 = 601.4657224454888;
    Output.points[4][6] += ld2;
    double ld3 = 695.5119427251674;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought274.getInstance(fd1, ad1, ad2, ad3);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        Thought lo1 = Thought308.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
        fd1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        double ld2 = 58.30682702629488;
        }
    ab3 = ad3 < ad4;
    if (ab4) {
        double ld3 = 438.25948681593303;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld3, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        } else if (fb1) {
        ab1 = ad2 < ad3;
if(fo1 != null){
          fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[4][7] += fd1;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    fd1 *= -1;
    Thought lo0 = Thought365.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao2 != null){
          ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 328.8254882008576;
    for(int i0=0; i0<10; i0++){
        ld1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb2 = true;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ld1, fd0);
}
        fb1 = fd1 > ld1;
        boolean lb3 = false;
        fd0 = fd1 - ld1;
        Output.points[4][8] += fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
        lb2 = lb3 || fb0;
        }
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    double ld4 = 447.4928360143073;

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
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought168.getInstance();
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    if (fb1) {
        Thought lo1 = Thought123.getInstance(fd1, ad1, ad2, ad3);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
        double ld2 = 495.64688129301123;
        Output.points[5][0] += ad1;
        double ld3 = 252.54480811097284;
        fb0 = ad1 < ad2;
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ld2 = ld3 + ad1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        Thought lo4 = Thought122.getInstance();
        ad2 = ad3 + ad4;
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
    if (ab1) {
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        fd1 = fd0 - fd1;
if(ao1 != null){
          fd0 = ao1.m3(ab3, ab4, fb0, fb1);
}
        ab1 = !ab2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        Output.points[5][1] += fd1;
        Thought lo0 = Thought341.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        fd0 = fd1 - fd0;
        ab1 = fd1 < fd0;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = ab2 && ab3;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Output.points[5][2] += fd0;
    double ld0 = 604.9169013621106;
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ad1);
}
    fb1 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    double ld1 = 461.44477765153675;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0);
}
        fb0 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        double ld1 = 689.2834478284763;
        if (fb1) {
            fd0 = fd1 + ld1;
            lb0 = fb0 || fb1;
            lb0 = fd0 > fd1;
if(fo1 != null){
              ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
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
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = ab4 || fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
    ab2 = fd1 < fd0;
    boolean lb0 = false;
    double ld1 = 771.6273001728997;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld1 + fd0;
    Output.points[5][3] -= fd1;
    Output.points[5][4] += ld1;
    Thought lo2 = Thought272.getInstance(fb1, lb0, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    Thought lo3 = Thought372.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
        boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd1 *= -1;
    double ld2 = 913.2789130627152;
    ld2 = ad1 + ad2;
    ad3 = ad4 - fd0;
    Thought lo3 = Thought86.getInstance(fo1, fo0, fo1, fo0);
    Thought lo4 = Thought391.getInstance(fd1, ld2, ad1, ad2);
    double ld5 = 660.000803600966;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ld2 - ld5;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;

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
    double ld0 = 656.0201790010769;
    double ld1 = 535.112443543988;
    boolean lb2 = true;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld1 *= -1;
    Output.points[5][5] -= ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo1.m2(ab3, ab4, fb0, fb1);
}
        double ld3 = 570.87040812638;
        Thought lo4 = Thought104.getInstance(fo0, fo1, fo0, fo1);
        fd0 = fd1 - ld3;
        lb2 = ab1 && ab2;
        ld0 = ld1 - ad1;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        ab3 = ld3 < ld0;
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        ab4 = fd0 < fd1;
        ld3 = ld0 + ld1;
        Output.points[5][6] += ad1;
        for(int i1=0; i1<10; i1++){
            boolean lb5 = true;
            ab4 = fb0 && fb1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought350.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[5][7] += fd1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(lb1, lb2, fb0, fb1);
}
    double ld3 = 127.92290592887278;
    lb1 = lb2 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - ld3;

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
    fb1 = fb0 && fb1;
    double ld0 = 319.9743300833125;
if(ao2 != null){
      ao2.m3(ld0, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    Output.points[5][8] += ad2;
    Thought lo1 = Thought270.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    ld0 *= -1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}
    ad4 *= -1;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      ao3.m1(fb1, lb2, fb0, fb1);
}
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fd1 < ld0;
    boolean lb3 = false;

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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    lb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb1);
}
    double ld2 = 159.1577435479864;
    ld2 = fd0 - fd1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ld2 = fd0 + fd1;
    ld2 *= -1;
    lb0 = !lb1;
    double ld3 = 945.3380641269198;
if(ao3 != null){
      ld3 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, ld3);
}
    double ld4 = 333.6644288043298;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Thought lo5 = Thought280.getInstance(ao4, fo0, fo1, ao1, ld4, fd0, fd1, ld2);
    boolean lb6 = false;
if(ao2 != null){
      ao2.m3(ld3, ld4, fd0, fd1, lb0, lb1, lb6, ab1);
}
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    boolean lb7 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought69.getInstance();
    ad2 *= -1;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    ad3 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      ad4 = ao2.m3(fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    double ld2 = 24.774784874010436;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld2, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld2, ad1, ad2, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ad3 *= -1;
        lb1 = ab1 && ab2;
if(fo0 != null){
          ab3 = fo0.m2();
}
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ad1, ab4, fb0, fb1, lb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought224.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = !fb0;
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    Output.points[6][0] -= fd1;
    Thought lo4 = Thought105.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);

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
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1();
}
    double ld0 = 861.7053720451444;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    double ld2 = 786.1731749587982;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + ld0;
    boolean lb5 = false;
    boolean lb6 = true;
    lb1 = ld2 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld2, fd0, fd1);
}
    Output.points[6][1] += ld0;
    ld2 *= -1;
    lb3 = !lb4;

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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 583.5750786342061;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought94.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    ld0 *= -1;
    fb1 = fb0 && fb1;
    double ld2 = 651.6989045218619;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ld2 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;

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
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb0 = false;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
        boolean lb1 = false;
        } else if (ab2) {
        ab3 = ad4 > fd0;
        ab4 = fd1 > ad1;
        ad2 = ad3 - ad4;
        fb0 = fb1 || ab1;
        ab2 = ab3 || ab4;
        fb0 = !fb1;
        fd0 *= -1;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        double ld2 = 791.7741928841574;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ld2 = ad1 + ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          ld2 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        } else if (ab1) {
        double ld3 = 702.4844687554036;
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        lb1 = lb2 && fb0;
        fb1 = lb0 || lb1;
        Output.points[6][2] += fd1;
        lb2 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        boolean lb3 = true;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb3, lb0);
}
        lb1 = lb2 || fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb3, lb0, lb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m1();
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad1 > ad2;
        fb1 = ad3 > ad4;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought198.getInstance(ao2, ao3, ao4, fo0);
        fb0 = !fb1;
if(fo1 != null){
          fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        Thought lo1 = Thought115.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = fd0 < fd1;
    Output.points[6][3] -= fd0;
    fd1 *= -1;
    Thought lo0 = Thought21.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m1(fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought80.getInstance(ao3, ao4, fo0, fo1);
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 + fd0;
    boolean lb3 = false;
    ab3 = fd1 < fd0;
    if (ab4) {
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb2, lb3, ab1);
}
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - fd0;
        Output.points[6][4] -= fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = !ab3;
    fd0 = fd1 + ad1;
    Output.points[6][5] += ad2;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    Output.points[6][6] -= ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
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
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 37.594124210342244;
    fb0 = fb1 || fb0;
    Output.points[6][7] -= fd0;
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought213.getInstance(fd1, ld0, fd0, fd1);
        lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
    fd1 = ld0 + fd0;
    lb2 = fd1 < ld0;
    fb0 = fd0 < fd1;

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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo0 = Thought61.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
        fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[6][8] -= fd1;

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
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought306.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb2 = true;
    boolean lb3 = true;
    fd1 *= -1;
    lb0 = lb2 || lb3;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb2, lb3);
}
    fb0 = !fb1;
    lb0 = !lb2;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    boolean lb4 = true;
        Output.points[7][0] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = false;
    fd1 *= -1;
    lb3 = lb4 || lb5;
    Thought lo6 = Thought295.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
    Thought lo7 = Thought141.getInstance(lb3, lb4, lb5, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
