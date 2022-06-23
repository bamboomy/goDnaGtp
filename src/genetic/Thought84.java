package genetic;
import java.util.ArrayList;
class Thought84 extends Thought{
private static ArrayList<Thought84> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 83.89667105674711;
private double fd1 = 682.0673527022191;
private Thought fo0 = null;
private Thought fo1 = null;
Thought84 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought84 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought84 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought84 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought84 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
    Thought lo0 = Thought47.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
        fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
        fb1 = !fb0;
        boolean lb1 = false;
        fb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
        double ld2 = 425.146972452045;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          ld2 = fo1.m3(fd0, fd1, ld2, fd0);
}
        fd1 = ld2 - fd0;
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
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
    Output.points[7][8] += fd0;
    if (ab4) {
if(fo1 != null){
          fo1.m3(fb0, fb1, ab1, ab2);
}
        boolean lb0 = true;
        ab2 = !ab3;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb1 = false;
        boolean lb2 = true;
        ab2 = fd0 > fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        fd1 *= -1;
        fd0 = fd1 + fd0;
        lb0 = !lb1;
        lb2 = fd1 > fd0;
        Thought lo3 = Thought50.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb4 = true;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
        lb2 = lb4 || ab1;
        ab2 = ab3 || ab4;
        fd0 = fd1 + fd0;
        fb0 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought44.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    double ld2 = 913.8040525709102;
    boolean lb3 = false;
if(fo0 != null){
      lb1 = fo0.m2(ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2, fb0, fb1, lb1, lb3);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld2, ad1);
}
    ad2 *= -1;
    Thought lo4 = Thought29.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        ld2 *= -1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    ad1 = ad2 + ad3;
    if (ab3) {
if(fo0 != null){
          ad4 = fo0.m3(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
        boolean lb1 = true;
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb2 = true;
        Output.points[8][0] -= fd0;
        fd1 *= -1;
        Output.points[8][1] += ad1;
        double ld3 = 802.7157070148522;
        } else if (ab1) {
        double ld4 = 988.7500038522148;
        ad1 *= -1;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        Thought lo1 = Thought57.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
        }
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    Thought lo2 = Thought68.getInstance(fd0, fd1, fd0, fd1);
    boolean lb3 = true;
    Thought lo4 = Thought47.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
    lb0 = lb3 && fb0;
    Thought lo5 = Thought29.getInstance(fb1, lb0, lb3, fb0);
    boolean lb6 = false;
    Thought lo7 = Thought81.getInstance();

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
    boolean lb0 = true;
    Thought lo1 = Thought96.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        lb0 = lb2 || fb0;
        fb1 = fd1 < ad1;
        Output.points[8][2] += ad2;
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
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = ab4 && fb0;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 549.3860005260748;
    ab3 = !ab4;
    Thought lo2 = Thought75.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
    fb0 = !fb1;
    Thought lo3 = Thought86.getInstance(lb0, ab1, ab2, ab3);
    fd0 = fd1 + ld1;
    boolean lb4 = false;
    double ld5 = 412.4933202557246;
    Output.points[8][3] += ld5;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo6 = Thought52.getInstance(fd0, fd1, ld1, ld5, ab3, ab4, fb0, fb1);
    lb0 = !lb4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[8][4] += fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld1, ld5, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld7 = 139.6136582448226;
    Output.points[8][5] -= ld1;
    Thought lo8 = Thought26.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb4);
if(fo0 != null){
      fo0.m1(ld5, ld7, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld5, ld7, fd0);
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
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    double ld0 = 717.3554505454017;
    Thought lo1 = Thought69.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Output.points[8][6] += ad1;
    fb1 = ab1 && ab2;
    ab3 = ad2 > ad3;
    ab4 = fb0 || fb1;
    ab1 = ad4 < fd0;
    fd1 *= -1;
    Output.points[8][7] -= ld0;
    boolean lb2 = true;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought40.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3();
}
    fd1 *= -1;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
    lb1 = !lb2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    Output.points[8][8] -= fd0;
    lb3 = lb4 && fb0;
    boolean lb5 = false;
    fb0 = fb1 || lb1;

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
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    Output.points[0][0] += fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    double ld3 = 173.26213216911492;
    fd0 = fd1 + ld3;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld4 = 96.90482454411;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, ld4, fd0, lb0, lb1, lb2, ab1);
}
    fd1 = ld3 + ld4;
    for(int i0=0; i0<10; i0++){
        double ld5 = 483.5215822987152;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo6 = Thought2.getInstance(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld5, ab2, ab3, ab4, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    boolean lb1 = false;

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
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        Output.points[0][1] += ad2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
        ab3 = ad1 > ad2;
        ab4 = ad3 > ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
        Output.points[0][2] += fd0;
        if (ab2) {
            ab3 = ab4 && fb0;
            boolean lb1 = false;
            fd1 = ad1 + ad2;
            Thought lo2 = Thought61.getInstance(ad3, ad4, fd0, fd1);
            fb0 = fb1 && lb1;
            lb0 = ab1 || ab2;
            Output.points[0][3] += ad1;
            Output.points[0][4] += ad2;
            double ld3 = 741.003615374533;
if(fo0 != null){
              ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
            if (ab4) {
}}}
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
    fb0 = fd0 < fd1;
    double ld0 = 880.9028564772069;
    fb1 = ld0 < fd0;
    Output.points[0][5] += fd1;
if(ao2 != null){
      ao2.m1(fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    ld0 *= -1;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = ld0 > fd0;
    boolean lb1 = false;
    if (lb1) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb0 = fd1 < ld0;
        boolean lb2 = true;
        fb0 = fd0 > fd1;
        ld0 = fd0 + fd1;
        fb1 = lb2 && lb1;
        fb0 = fb1 || lb2;
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
    Thought lo0 = Thought58.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    boolean lb1 = false;
    lb1 = !fb0;
    Output.points[0][6] += ad2;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    lb1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb1, fb0, fb1);
}
        Output.points[0][7] += ad1;
if(ao2 != null){
      lb1 = ao2.m2();
}
    Thought lo2 = Thought79.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = !lb1;
    fb0 = !fb1;
    double ld3 = 794.1902242678697;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld3, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    Thought lo4 = Thought80.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
    fb1 = ad4 > fd0;
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, ad1, ad2);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(ao2 != null){
      ao2.m3(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    ab2 = fd1 < fd0;
    ab3 = !ab4;
    double ld0 = 246.0377103689928;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[0][8] += ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    Output.points[1][0] -= fd1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    double ld0 = 263.160681075448;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
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
    fd1 = fd0 + fd1;
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 539.5667898084997;
    Thought lo1 = Thought26.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought49.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 > ld0;
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
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
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    lb0 = lb1 || ab1;
    double ld2 = 481.85649139800853;
    ab2 = ld2 < fd0;
    double ld3 = 701.812468679933;
    Output.points[1][1] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    ld2 = ld3 + fd0;
    lb0 = fd1 < ld2;
    ld3 *= -1;
    fd0 = fd1 + ld2;
if(fo1 != null){
      ld3 = fo1.m3();
}
    Output.points[1][2] -= fd0;
    fd1 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 633.0317731757638;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        boolean lb1 = true;
        for(int i0=0; i0<10; i0++){
            fb0 = fb1 || lb1;
            fb0 = !fb1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            lb1 = fb0 || fb1;
            ld0 *= -1;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
            fd0 = fd1 + ld0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
            Output.points[1][3] += ad1;
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
              ad3 = fo1.m3(fb1, lb1, fb0, fb1);
}
            ad4 = fd0 - fd1;
            Output.points[1][4] += ld0;
            ad1 = ad2 - ad3;
            lb1 = fb0 && fb1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    boolean lb0 = false;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 520.5856268434926;
    fb0 = fb1 || lb0;
    boolean lb2 = false;
    double ld3 = 640.8337901026368;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = ab1 && ab2;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[1][5] += fd1;
    Thought lo0 = Thought86.getInstance();
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    fb0 = fd0 > fd1;
    double ld2 = 566.4026170735252;
    ld2 *= -1;
    fd0 *= -1;
    Thought lo3 = Thought99.getInstance(fd1, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
    lb1 = fb0 && fb1;
    ld2 *= -1;
    lb1 = !fb0;

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
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought38.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;

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
    ab2 = ab3 || ab4;
    Output.points[1][6] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = false;
if(ao3 != null){
          ab4 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo1 = Thought90.getInstance(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
    boolean lb2 = false;
    ab3 = !ab4;
    fb0 = !fb1;
    lb0 = lb2 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fb1 = !lb0;
        fd1 = fd0 - fd1;
        fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(lb2, ab1, ab2, ab3);
}
        boolean lb3 = true;
        boolean lb4 = false;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ao4 = fo0.m4();
}
if(fo1 != null){
              fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
}}
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
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought13.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought76.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    double ld3 = 942.1360386353746;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ld3 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    if (ab2) {
        ab3 = !ab4;
        boolean lb4 = false;
        double ld5 = 108.7520339924881;
        ab4 = ad4 < fd0;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd1, ld5, ld3, ad1);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 - ld5;
        Thought lo6 = Thought25.getInstance(fb0, fb1, lb4, lb0);
        ld3 = ad1 + ad2;
        Thought lo7 = Thought97.getInstance();
        double ld8 = 322.08780578859097;
        ab1 = ad2 < ad3;
        Output.points[1][7] -= ad4;
        Output.points[1][8] -= fd0;
if(ao3 != null){
          fd1 = ao3.m3(ld5, ld8, ld3, ad1, ab2, ab3, ab4, fb0);
}
        Thought lo9 = Thought23.getInstance(ao4, fo0, fo1, ao1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[2][0] -= fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
    fb0 = fb1 || lb0;
    double ld2 = 428.0770406849312;
    lb1 = fb0 && fb1;
    boolean lb3 = false;
    if (lb0) {
        lb1 = lb3 && fb0;
        fb1 = ld2 < fd0;
        boolean lb4 = false;
        lb4 = fd1 > ld2;
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
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[2][1] -= fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb0 = false;
    Output.points[2][2] -= fd0;
    fd1 *= -1;
    lb0 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
        boolean lb1 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;

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
    ad2 *= -1;
    double ld0 = 914.0866236568763;
    ad2 *= -1;
        boolean lb1 = true;
    lb1 = fb0 || fb1;
    double ld2 = 842.9554330925765;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    lb1 = fb0 && fb1;
    ld0 = ld2 - ad1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fd1 = ld0 + ld2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ad1 < ad2;
    fb1 = !lb1;

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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = false;
    double ld2 = 367.15039567852597;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld4 = 297.8505187398728;

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
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
        Output.points[2][3] += fd1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(ao4 != null){
      fd0 = ao4.m3();
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    double ld2 = 508.67239213017785;
    boolean lb3 = false;
    boolean lb4 = false;
    ld2 = fd0 - fd1;
if(ao1 != null){
      lb3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    lb4 = fb0 || fb1;
    Output.points[2][4] += ld2;
    double ld5 = 224.97387898484206;
    boolean lb6 = false;
if(fo1 != null){
      ld5 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ld5, lb0, lb1, lb3, lb4);
}
    if (lb6) {
        boolean lb7 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb6, fb0, fb1, lb7);
}
        fd0 = fd1 - ld2;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    Output.points[2][5] += fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, fb0, fb1);
}
    lb0 = ad3 > ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;

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
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Thought lo0 = Thought49.getInstance();
    ab2 = fd1 > fd0;
    Thought lo1 = Thought87.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Output.points[2][6] += fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought51.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    double ld3 = 794.0981181148045;
        fd0 = fd1 - ld3;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    double ld4 = 437.4354411696397;
    ld4 = fd0 - fd1;
        ab3 = ab4 || fb0;
    ld3 = ld4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld3, ld4, fd0);
}
    Thought lo5 = Thought1.getInstance(fo0, fo1, ao1, ao2, fd1, ld3, ld4, fd0);
if(ao3 != null){
      fb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao4 != null){
      ab1 = ao4.m2();
}
    Output.points[2][7] -= fd1;
    Thought lo6 = Thought22.getInstance(ld3, ld4, fd0, fd1, ab2, ab3, ab4, fb0);
    ld3 = ld4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = fd1 > ld3;
    ab1 = !ab2;
    ld4 = fd0 + fd1;

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
    boolean lb0 = true;
    lb0 = !ab1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought62.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    fb1 = !lb0;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    fb1 = lb0 || ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, ab1);
}
    double ld2 = 298.3739249459162;
    Thought lo3 = Thought8.getInstance();
    boolean lb4 = true;
    Output.points[2][8] += ad1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought43.getInstance(ao2, ao3, ao4, fo0);
    double ld6 = 835.019616185295;
    Thought lo7 = Thought96.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ld6, fb0, fb1, lb0, lb4);
    ab1 = ad1 < ad2;
        ab2 = ab3 || ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb4);
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld2);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld6, ad1, ad2, ad3);
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
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 > fd0;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    boolean lb3 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
    Output.points[3][0] += fd1;
    Output.points[3][1] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
}
    fb0 = fd0 < fd1;
        boolean lb4 = true;
    Thought lo5 = Thought68.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb3, lb4, fb0, fb1);
}
    lb0 = lb1 || lb2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, lb4, lb6, fb0);
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
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Thought lo0 = Thought40.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Output.points[3][2] += fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought75.getInstance(lb1, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m2();
}
    lb1 = !lb2;
    fb0 = fb1 || lb1;

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
    Thought lo0 = Thought62.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    Output.points[3][3] -= fd1;
    Thought lo2 = Thought15.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
        fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Output.points[3][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    Output.points[3][5] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb1, fb0);
}
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
}
