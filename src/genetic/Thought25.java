package genetic;
import java.util.ArrayList;
class Thought25 extends Thought{
private static ArrayList<Thought25> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 99.16309586143949;
private double fd1 = 602.0426385266227;
private Thought fo0 = null;
private Thought fo1 = null;
Thought25 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought25 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought25 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought25 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought25 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    Thought lo1 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought19.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    double ld3 = 347.8619388540436;
    boolean lb4 = true;
    boolean lb5 = true;
    lb0 = fd0 < fd1;
    boolean lb6 = false;
    double ld7 = 809.8997521341086;
    lb4 = !lb5;
        boolean lb8 = true;
    lb6 = ld3 > ld7;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought89.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo0.m2(ab4, fb0, fb1, lb0);
}
    if (lb2) {
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb3 = false;
        Output.points[3][0] -= fd1;
        boolean lb4 = false;
        lb0 = fd0 < fd1;
        Output.points[3][1] += fd0;
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
        fd1 = fd0 - fd1;
        Thought lo5 = Thought20.getInstance(fo0, fo1, fo0, fo1);
        fd0 = fd1 - fd0;
        ab4 = !fb0;
        fb1 = lb3 || lb4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb2, ab1, ab2);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
        fb1 = !fb0;
    fb1 = fd1 > ad1;
    if (fb0) {
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
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > ad1;
    double ld0 = 103.31856082721713;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld2 = 827.8205454773477;
    ld0 = ld2 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought86.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3();
}
    Output.points[3][2] -= fd1;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    boolean lb2 = true;
    fd0 *= -1;
    Thought lo3 = Thought19.getInstance(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
    boolean lb4 = false;
    lb2 = fd1 > fd0;
    lb4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, lb2, lb4, fb0);
}
    fb1 = lb1 && lb2;
    fd1 = fd0 + fd1;
    lb4 = fb0 && fb1;
    double ld5 = 766.3746592055011;
    ld5 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb1, lb2, lb4, fb0);
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
    fb0 = ad1 > ad2;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb1 = ao2.m2(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    boolean lb2 = false;

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
      ao1 = ao2.m4();
}
    Thought lo0 = Thought97.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab4 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && lb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
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
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao4.m1();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
        double ld0 = 610.5927768900583;
        ab2 = ad1 > ad2;
        boolean lb1 = true;
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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    double ld0 = 238.05502234818255;
    double ld1 = 547.406082393626;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    ld1 = fd0 - fd1;
    double ld2 = 46.929876640725674;
    boolean lb3 = true;
    ld0 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
        boolean lb5 = false;
        lb4 = lb5 || lb3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, fb0, fb1, lb4, lb5);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
        ab3 = !ab4;
        fd0 = fd1 - fd0;
        }
    boolean lb1 = false;
    ab4 = !fb0;
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought56.getInstance(fd0, fd1, fd0, fd1);

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
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    for(int i0=0; i0<10; i0++){
        }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    Output.points[3][3] += ad4;
    double ld1 = 523.4069472061484;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[3][4] += ad1;
    fb1 = lb0 || fb0;
    double ld2 = 398.41785814106197;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought12.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Thought lo4 = Thought2.getInstance(ad1, ad2, ad3, ad4);
    fb1 = fd0 < fd1;
    ld1 = ld2 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb5 = false;
    lb0 = lb5 || fb0;

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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    double ld1 = 915.2985298908154;
    ab1 = fd0 > fd1;
    ab2 = ld1 < ad1;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought93.getInstance();
    double ld3 = 564.7807045359625;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    fd1 *= -1;

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
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought62.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought68.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Thought lo2 = Thought18.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought69.getInstance(fb1, fb0, fb1, fb0);
        fd0 = fd1 + fd0;
    double ld4 = 216.12959951507943;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = !fb0;
    boolean lb5 = true;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld4, fd0, fd1, fb0, fb1, lb5, fb0);
}
    fb1 = ld4 < fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    lb5 = fd1 < ld4;
    boolean lb6 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld4, fd0, lb6, fb0, fb1, lb5);
}
    fd1 = ld4 - fd0;
    fd1 = ld4 + fd0;
    Thought lo7 = Thought89.getInstance(ao4, fo0, fo1, ao1, lb6, fb0, fb1, lb5);
    lb6 = !fb0;
    boolean lb8 = true;
    Thought lo9 = Thought42.getInstance(fd1, ld4, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld4, fd0, fd1, ld4);
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
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2();
}
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought20.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
    fb0 = fb1 && lb0;
    lb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
    lb0 = lb1 && fb0;
    double ld3 = 768.8421523252326;
    Output.points[3][5] -= ad1;
    ad2 = ad3 - ad4;
    Thought lo4 = Thought80.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld3, ad1);
    Thought lo5 = Thought74.getInstance(fb1, lb0, lb1, fb0);
    Output.points[3][6] -= ad2;
    fb1 = lb0 || lb1;
if(ao4 != null){
      fb0 = ao4.m2();
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    boolean lb6 = false;
    ld3 = ad1 + ad2;
    Thought lo7 = Thought44.getInstance(fo1, ao1, ao2, ao3);

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fd1 < fd0;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Thought lo1 = Thought66.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(lb0, ab1, ab2, ab3);
}
    double ld2 = 925.8423851517692;
if(ao1 != null){
      ld2 = ao1.m3();
}
if(ao2 != null){
      ab4 = ao2.m2(fd0, fd1, ld2, fd0, fb0, fb1, lb0, ab1);
}
    Output.points[3][7] += fd1;
    double ld3 = 952.199379459808;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
    ld2 = ld3 + fd0;
    Thought lo4 = Thought74.getInstance(ao2, ao3, ao4, fo0, fd1, ld2, ld3, fd0, fb0, fb1, lb0, ab1);
    ab2 = fd1 < ld2;
    ld3 = fd0 - fd1;
    double ld5 = 384.85634712213584;
    ab3 = !ab4;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
}
    double ld6 = 947.7336395918379;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld5, ld6, fd0);
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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought25.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
if(fo0 != null){
      ad3 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = true;
    Thought lo2 = Thought20.getInstance(fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
    ab4 = ad4 < fd0;
    fb0 = !fb1;
    lb1 = fd1 < ad1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = fd1 < ad1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    if (lb1) {
if(fo0 != null){
          fo0.m1(ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
        ad1 = ad2 - ad3;
        boolean lb3 = false;
        Thought lo4 = Thought83.getInstance();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    double ld0 = 466.73877513050655;
    fb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought22.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    boolean lb3 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    lb3 = fd1 < ld0;

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
    fd0 = fd1 - fd0;
    Output.points[3][8] -= fd1;
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        Thought lo0 = Thought86.getInstance(fo0, fo1, fo0, fo1);
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        Thought lo1 = Thought96.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
        Thought lo2 = Thought47.getInstance(fd1, fd0, fd1, fd0);
        fb1 = ab1 || ab2;
        fd1 = fd0 + fd1;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        fd1 *= -1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo1.m1();
}
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    double ld0 = 494.39038060002906;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < ad1;
    boolean lb1 = false;
    boolean lb2 = true;
    ad2 = ad3 + ad4;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    Thought lo3 = Thought16.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
    ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb1, lb1, lb2, fb0);
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
    ab2 = ad1 < ad2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[4][0] -= ad1;
    double ld0 = 711.022223849426;
        if (ab1) {
if(fo1 != null){
          ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought24.getInstance();
        ab1 = !ab2;
        } else if (ab3) {
        if (ab4) {
            ad1 = ad2 + ad3;
            fb0 = fb1 && ab1;
            ad4 = fd0 - fd1;
            ab2 = ab3 && ab4;
            ld0 *= -1;
if(fo0 != null){
              fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
            for(int i0=0; i0<10; i0++){
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
                boolean lb2 = true;
}}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;

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
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = ad2 < ad3;
    if (fb0) {
        Output.points[4][1] -= ad4;
if(ao2 != null){
          ao2.m2(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
        boolean lb1 = true;
        Thought lo2 = Thought89.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
          ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, lb1, lb0, fb0, fb1);
}
        Thought lo3 = Thought60.getInstance(fo1, ao1, ao2, ao3, lb1, lb0, fb0, fb1);
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        lb1 = !lb0;
        fb0 = !fb1;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        Thought lo4 = Thought68.getInstance(lb1, lb0, fb0, fb1);
if(fo0 != null){
          ad1 = fo0.m3();
}
        double ld5 = 858.7208366285917;
        lb1 = ad1 > ad2;
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
    Thought lo0 = Thought95.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 580.5668459467573;
    Output.points[4][2] -= ld1;
    double ld2 = 745.6797473337219;
    Thought lo3 = Thought97.getInstance(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(ld2, fd0, fd1, ld1);
}
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
    fd0 *= -1;
if(ao1 != null){
      ao1.m1();
}
    double ld4 = 74.26980954491138;
    ab4 = fd0 > fd1;
    fb0 = fb1 && ab1;
    ld1 = ld2 - ld4;
    ab2 = !ab3;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, ld2, ld4, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 && fb1;

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
    ad1 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
    ab2 = ab3 && ab4;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    double ld1 = 528.6954356712015;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought71.getInstance(ld1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
}
        ad1 = ad2 + ad3;
if(fo0 != null){
          lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb2;
        boolean lb4 = false;
        ad4 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4();
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought56.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought80.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Output.points[4][3] -= fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[4][4] -= fd1;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    Output.points[4][5] -= fd0;

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
    Output.points[4][6] += fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought69.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
    ab2 = fd0 < fd1;
    boolean lb2 = false;
    ab2 = !ab3;
    Output.points[4][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
    lb2 = fd0 > fd1;

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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought45.getInstance(ad1, ad2, ad3, ad4);
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    ad1 *= -1;
    Thought lo1 = Thought51.getInstance();
    fb0 = fb1 || fb0;
    Thought lo2 = Thought3.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > ad1;
    boolean lb3 = true;

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
    ab2 = ab3 && ab4;
    Thought lo0 = Thought64.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    boolean lb1 = true;
    boolean lb2 = false;
    ab1 = fd1 > ad1;

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
    fb1 = fd1 < fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[4][8] += fd1;
    Thought lo0 = Thought72.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought75.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought51.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;

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
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    double ld0 = 696.6983865461447;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb1, fb0);
}
    double ld2 = 773.9353977121564;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    boolean lb3 = false;
    ld0 = ld2 + ad1;
    lb1 = lb3 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    lb1 = !lb3;
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, lb1, lb3, fb0);
}
    Output.points[5][0] += ld2;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb3);
}
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
        Thought lo5 = Thought42.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld2);
    boolean lb6 = true;

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
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought45.getInstance(ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    fb1 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld1 = 613.4858790144451;
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought22.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);

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
    boolean lb0 = false;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
    ab4 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fb1, lb0, ab1, ab2);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb1 = false;
        ab2 = ad3 > ad4;
        ab3 = fd0 < fd1;
        ad1 = ad2 - ad3;
        ab4 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb1, lb1, lb0, ab1);
}
        Thought lo2 = Thought58.getInstance(fo0, fo1, ao1, ao2);
        boolean lb3 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        boolean lb4 = true;
        fd1 = ad1 + ad2;
        ab4 = fb0 && fb1;
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1, lb3, lb4, lb0, ab1);
}
if(ao2 != null){
          ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 - ad4;
        boolean lb5 = false;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        ab1 = ad4 > fd0;
if(ao2 != null){
          ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
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
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    Output.points[5][1] += fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd1 = fd0 + fd1;
    double ld2 = 427.4042362525088;
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld2, fd0, lb0, lb1, fb0, fb1);
}
    Output.points[5][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    lb0 = ld2 > fd0;
    lb1 = fd1 > ld2;

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
    boolean lb0 = false;
    Output.points[5][3] -= fd1;
    Output.points[5][4] -= fd0;
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought43.getInstance(fd0, fd1, fd0, fd1);
    Output.points[5][5] -= fd0;
    boolean lb2 = false;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    lb0 = lb2 && fb0;
    fb1 = !lb0;
    boolean lb3 = false;
    double ld4 = 488.44265070734866;
    fd0 *= -1;
    lb2 = lb3 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2(lb2, lb3, fb0, fb1);
}
    Thought lo5 = Thought81.getInstance();

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
    Thought lo0 = Thought96.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[5][6] -= fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    double ld1 = 851.7543830508703;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[5][7] += ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[5][8] -= fd1;
    ld1 *= -1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
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
