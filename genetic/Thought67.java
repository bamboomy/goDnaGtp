package genetic;
import java.util.ArrayList;
class Thought67 extends Thought{
private static ArrayList<Thought67> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 467.4443517710733;
private double fd1 = 748.1836016588358;
private Thought fo0 = null;
private Thought fo1 = null;
Thought67 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought67 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought67 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought67 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought67 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    Thought lo0 = Thought89.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
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
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 385.18316247534904;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 563.5038425124327;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld1);
}
    ab1 = !ab2;
    boolean lb3 = true;
    ld2 = fd0 + fd1;
    Thought lo4 = Thought88.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, fb1, lb0, lb3, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 < ld2;
    double ld5 = 639.5691887390639;
    lb0 = lb3 && ab1;
    Output.points[4][4] += ld5;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
    ld5 *= -1;

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
      fo1 = fo0.m4();
}
    Thought lo0 = Thought1.getInstance(ad2, ad3, ad4, fd0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld1 = 363.17344672676745;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    Output.points[4][5] += ad2;
    double ld2 = 751.4839541032674;
    ad2 = ad3 - ad4;
    double ld3 = 465.8253894757431;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;

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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 961.3298287362184;
    ld0 = ad1 + ad2;
    fb0 = !fb1;
    ab1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    if (ab1) {
if(fo0 != null){
          ab2 = fo0.m2(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
        double ld1 = 971.2907733903611;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab1 = ad1 > ad2;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
        double ld2 = 480.60641532640346;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ld2 > ld0;
        Output.points[4][6] += ad1;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
}
        Output.points[4][7] -= ld0;
        ab1 = ad1 > ad2;
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
    Thought lo0 = Thought32.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(ao1 != null){
      fd1 = ao1.m3(lb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, lb2, lb3, fb0);
}
    fb1 = !lb1;
    Output.points[4][8] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb2, lb3, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    fb0 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    if (fb1) {
if(ao4 != null){
          ao4.m1(ad3, ad4, fd0, fd1);
}
        fb0 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
        boolean lb1 = true;
        ad3 = ad4 - fd0;
        if (lb1) {
            fd1 = ad1 + ad2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 308.7095993247431;
    ab1 = fd0 < fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[5][0] += ld0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb1 = false;
    boolean lb2 = true;
    ab3 = fd1 > ld0;
    Thought lo3 = Thought12.getInstance(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
    Thought lo4 = Thought23.getInstance();
    lb2 = fd1 < ld0;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld0, fd0, fd1);
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
    ab1 = ad1 < ad2;
    ab2 = ad3 > ad4;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    if (fb1) {
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
        ad1 = ad2 - ad3;
        fb0 = fb1 || ab1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        ab2 = ab3 && ab4;
        Output.points[5][1] += ad4;
        fd0 = fd1 + ad1;
        boolean lb0 = true;
if(fo1 != null){
          ab4 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
        ab2 = ab3 || ab4;
        if (fb0) {
            for(int i0=0; i0<10; i0++){
                fd1 = ad1 + ad2;
                fb1 = lb0 || ab1;
}}}
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
    Thought lo0 = Thought86.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 413.14406958920574;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    double ld2 = 528.7640940470463;
    boolean lb3 = true;
    ld2 = fd0 + fd1;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = lb3 && fb0;
    fb1 = ld2 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, fd0, lb3, fb0, fb1, lb3);
}
    Thought lo4 = Thought45.getInstance();
    fb0 = fb1 || lb3;
        fb0 = fd1 < ld1;
    ld2 = fd0 + fd1;
    double ld5 = 221.75248268383302;
    Output.points[5][2] += ld1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld5, fd0, fd1);
}
    ld1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(lb3, fb0, fb1, lb3);
}
    ld2 = ld5 + fd0;

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
    fd0 = fd1 - fd0;
    double ld0 = 693.1919461372922;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    Thought lo2 = Thought13.getInstance();
    fd0 *= -1;
    ab3 = !ab4;
    fd1 = ld0 + fd0;
    double ld3 = 171.32746542558442;
    Output.points[5][3] += fd0;
    Output.points[5][4] += fd1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(ld0, ld3, fd0, fd1);
}
    Thought lo5 = Thought35.getInstance(ab4, fb0, fb1, lb1);
    ld0 = ld3 - fd0;
    fd1 *= -1;
    lb4 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1);
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
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 592.443194215059;
    ld0 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fb0 = fd1 < ld0;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    fb1 = ab1 && ab2;
    fd1 *= -1;
    boolean lb0 = true;
    if (ab2) {
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        double ld1 = 911.5849717146359;
        ab3 = fd0 > fd1;
        ab4 = ld1 > ad1;
        boolean lb2 = true;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
        boolean lb3 = false;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        double ld4 = 886.9919534904644;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb3, lb0, ab1, ab2);
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
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        fb0 = !fb1;
        if (lb0) {
            fb0 = fb1 || lb0;
            fb0 = !fb1;
            boolean lb1 = false;
            for(int i1=0; i1<10; i1++){
                if (lb1) {
if(ao2 != null){
                      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb0);
}
                    fd0 = fd1 - fd0;
if(ao1 != null){
                      ao1.m2(ao2, ao3, ao4, fo0);
}
                    boolean lb2 = true;
if(fo1 != null){
                      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb2);
}
                    boolean lb3 = false;
if(ao1 != null){
                      ao1.m1();
}
if(ao2 != null){
                      ao2.m1(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
                      ao3 = ao4.m4(lb3, lb1, lb0, fb0);
}
                    boolean lb4 = true;
                    } else {
                    fd0 = fd1 + fd0;
                    lb0 = fb0 && fb1;
                    Thought lo5 = Thought38.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}}}}
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
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3);
}
        Thought lo0 = Thought73.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(ao4 != null){
          fd0 = ao4.m3();
}
        fd1 = ad1 - ad2;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
    double ld2 = 37.821834894346395;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Output.points[5][5] -= fd0;
    fd1 = ld2 + ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
    double ld0 = 606.5063654411377;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Output.points[5][6] += fd0;
    Thought lo1 = Thought69.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = ld0 > fd0;
        fb0 = fb1 && ab1;
    boolean lb2 = true;
    fd1 *= -1;
    ab1 = !ab2;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    ab3 = ab4 && fb0;
    Output.points[5][7] -= fd0;
    for(int i0=0; i0<10; i0++){
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
    ab1 = ab2 && ab3;
    Output.points[5][8] += ad1;
    boolean lb0 = false;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > ad1;
    boolean lb1 = true;
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3();
}
    fd1 *= -1;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    Output.points[6][0] -= ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;

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
    Thought lo0 = Thought32.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 683.0876759802929;
    fb1 = ld1 < fd0;
    boolean lb2 = true;
    fd1 = ld1 - fd0;
    lb2 = fb0 && fb1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    boolean lb3 = true;
    fb0 = !fb1;
    boolean lb4 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb3 = fd1 < ld1;
    boolean lb5 = true;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0, lb4, lb5, fb0, fb1);
}
    lb2 = lb3 || lb4;
    lb5 = !fb0;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, lb4, lb5);
}
    Thought lo6 = Thought56.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb2, lb3);
}
    lb4 = lb5 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, lb3, lb4);
}
    lb5 = !fb0;

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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 918.2910450173705;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd1 > ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    ld0 *= -1;
    Thought lo1 = Thought12.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    fb1 = ld0 < fd0;
    double ld2 = 950.8437129974493;
    ab1 = ab2 || ab3;
    double ld3 = 173.10618043479812;
    ab4 = fb0 && fb1;
    ab1 = ld3 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld3);
}
    Thought lo4 = Thought98.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    ld3 *= -1;
    Thought lo5 = Thought44.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    Thought lo6 = Thought13.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ab2 || ab3;

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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    Output.points[6][1] -= ad2;
    boolean lb1 = false;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb1);
}
    fb0 = fd0 > fd1;
    double ld2 = 621.6784362662844;
    ld2 *= -1;
    fb1 = lb0 && lb1;
    fb0 = fb1 || lb0;
        boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb1 = lb3 && fb0;
    fb1 = fd0 < fd1;
    Thought lo4 = Thought89.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, lb0, lb1, lb3, fb0);
    Thought lo5 = Thought88.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb3);
    Thought lo6 = Thought73.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || lb0;
    ad4 *= -1;
    lb1 = fd0 > fd1;
    lb3 = ld2 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
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
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = ad1 > ad2;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought50.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ad4 *= -1;
    boolean lb1 = true;
    ab2 = fd0 < fd1;

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
    fb1 = fb0 && fb1;
    if (fb0) {
        boolean lb0 = false;
        double ld1 = 472.6980143919351;
        fb0 = fd0 < fd1;
        } else if (fb0) {
        double ld2 = 749.9373608007319;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        Thought lo3 = Thought77.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
        fb0 = fb1 || fb0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              fb1 = ao4.m2(ld2, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
            fb0 = fd0 < fd1;
if(fo1 != null){
              fo0 = fo1.m4();
}
            }
        ld2 *= -1;
        Thought lo4 = Thought20.getInstance(fd0, fd1, ld2, fd0);
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
        boolean lb5 = true;
        boolean lb6 = false;
if(ao3 != null){
          ld2 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, lb5, lb6, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Thought lo0 = Thought83.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 = ad4 + fd0;
if(ao2 != null){
      fb0 = ao2.m2();
}
    Output.points[6][2] += fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = ad1 < ad2;
    ad3 *= -1;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    double ld2 = 116.6480531250416;
    ad3 = ad4 - fd0;
    boolean lb3 = false;
    lb1 = fd1 > ld2;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(lb3, fb0, fb1, lb1);
}
    double ld4 = 279.4213208122982;

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
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = !ab1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        boolean lb0 = true;
        Thought lo1 = Thought8.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
        double ld2 = 349.3191551332321;
        double ld3 = 621.6520503103484;
        ld2 = ld3 + fd0;
        }
    ab3 = ab4 || fb0;
    fd1 = fd0 + fd1;

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
    ab2 = ad2 < ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ab3 = ad4 > fd0;
    ab4 = fd1 > ad1;
    boolean lb0 = true;
        double ld1 = 303.6523765180367;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 < fd1;
    Output.points[6][3] += ld1;
if(ao2 != null){
      ab2 = ao2.m2();
}
    double ld2 = 986.9494232093547;
    ab3 = ld2 < ad1;
    Output.points[6][4] += ad2;
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld2, ad1, ad2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought33.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought7.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fd1 > fd0;
    Output.points[6][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
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
    ab1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    Output.points[6][6] -= fd1;
    ab4 = fd0 > fd1;
    Output.points[6][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;

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
    Thought lo0 = Thought10.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[6][8] -= fd1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    Thought lo1 = Thought34.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
    fd1 = ad1 + ad2;
    boolean lb3 = true;
    ad3 = ad4 + fd0;
    Output.points[7][0] += fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        lb2 = lb3 || fb0;
        }
    boolean lb4 = false;
    Thought lo5 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb2, lb3);
    ad3 *= -1;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, lb6, fb0, fb1);
}
    double ld7 = 604.7565669643697;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[7][1] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    Output.points[7][2] -= ad1;
    fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought63.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3();
}
    boolean lb1 = false;
    Thought lo2 = Thought90.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    boolean lb0 = true;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > ad1;
    double ld1 = 209.00156155055822;
    boolean lb2 = false;
    Output.points[7][3] -= ad1;
    fb0 = fb1 || lb0;
    Output.points[7][4] -= ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
    double ld3 = 820.3252639436889;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ld1;
    fb1 = ld3 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb0, lb2, fb0, fb1);
}
    boolean lb4 = false;
    lb0 = lb2 && lb4;
    fd1 = ld1 - ld3;
if(ao3 != null){
      ao3.m2();
}
    Output.points[7][5] += ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ld3);
}
    fb0 = ad1 > ad2;

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
    boolean lb0 = true;
    Thought lo1 = Thought54.getInstance(lb0, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    double ld2 = 576.963655777366;
        Thought lo3 = Thought48.getInstance(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2);
    if (ab4) {
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb4);
}
        Output.points[7][6] -= fd1;
        lb0 = ld2 > fd0;
        Thought lo5 = Thought86.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
        Thought lo6 = Thought51.getInstance(ao3, ao4, fo0, fo1);
        fb0 = fd1 > ld2;
        fb1 = fd0 > fd1;
        lb4 = ld2 < fd0;
        Output.points[7][7] += fd1;
if(ao2 != null){
          ao1 = ao2.m4(ld2, fd0, fd1, ld2, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        double ld7 = 809.0931170501078;
        ld2 *= -1;
        for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
    boolean lb0 = false;
    ad4 *= -1;
    boolean lb1 = false;

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
    fd0 *= -1;
    fb0 = fb1 || fb0;
    double ld0 = 291.23087056201393;
    Thought lo1 = Thought75.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    double ld2 = 688.806203233489;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    ld0 *= -1;
    ld2 = fd0 - fd1;
    ld0 = ld2 - fd0;
    boolean lb3 = true;
    boolean lb4 = true;
    lb4 = fb0 || fb1;

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
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
        Output.points[7][8] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    Output.points[8][0] -= fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    double ld1 = 183.01658961284812;
    Thought lo2 = Thought47.getInstance();
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, fd0);
}
    fb0 = fd1 > ld1;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
}
    double ld3 = 820.1338505651443;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1);
}
        ld3 = fd0 - fd1;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
    boolean lb4 = false;
    Output.points[8][1] -= ld1;
    lb0 = lb4 || fb0;
    fb1 = lb0 && lb4;

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
