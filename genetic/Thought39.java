package genetic;
import java.util.ArrayList;
class Thought39 extends Thought{
private static ArrayList<Thought39> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 992.7586317903381;
private double fd1 = 721.0635316579834;
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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought66.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    double ld1 = 224.9150522960324;
    Thought lo2 = Thought47.getInstance(ld1, fd0, fd1, ld1);
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    Thought lo3 = Thought55.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[4][7] += fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    Thought lo1 = Thought87.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 || ab2;

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
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[4][8] += fd0;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Output.points[5][0] -= ad2;
    boolean lb0 = false;
    boolean lb1 = false;

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
    ab1 = ad1 < ad2;
    ab2 = !ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 || fb0;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought93.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = true;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 725.0653997609741;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = !fb1;
    fd0 = fd1 + ld0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb2 = false;
    fd0 = fd1 - ld0;
if(ao3 != null){
      lb1 = ao3.m2(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    lb2 = !fb0;
    fb1 = !lb1;
    lb2 = fb0 || fb1;
    ld0 = fd0 - fd1;
    Thought lo3 = Thought71.getInstance(ld0, fd0, fd1, ld0);
    Thought lo4 = Thought2.getInstance(lb1, lb2, fb0, fb1);
    boolean lb5 = true;
    if (lb1) {
        fd0 = fd1 + ld0;
        lb2 = lb5 && fb0;
        fb1 = fd0 < fd1;
        ld0 *= -1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, lb1, lb2, lb5, fb0);
}
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb1, lb2, lb5);
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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought89.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    ad1 *= -1;
if(ao1 != null){
      ao1.m3();
}
    ad2 = ad3 + ad4;
    Output.points[5][1] += fd0;
    fb1 = fd1 < ad1;
    Output.points[5][2] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    Output.points[5][3] += ad1;
if(ao4 != null){
      ao4.m1(fb0, fb1, fb0, fb1);
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought31.getInstance(fo1, ao1, ao2, ao3);
    fd0 = fd1 + fd0;
    lb0 = lb1 || ab1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    double ld4 = 812.0341154374591;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb0 = ao2.m2(ld4, fd0, fd1, ld4);
}
    fb1 = !lb0;
    Thought lo5 = Thought56.getInstance(lb1, lb3, ab1, ab2);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld4, fd0, fd1);
}
    boolean lb6 = true;
    ld4 *= -1;
    ab2 = fd0 < fd1;
    boolean lb7 = true;
if(ao2 != null){
      ld4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb8 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb3 = ld4 > fd0;
    Output.points[5][4] += fd1;
    ld4 = fd0 - fd1;
    lb6 = lb7 || lb8;

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
    Thought lo0 = Thought53.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    Output.points[5][5] -= fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        Thought lo1 = Thought91.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
        double ld2 = 422.9648948491883;
        ad4 = fd0 + fd1;
        ab1 = ld2 > ad1;
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        ad2 *= -1;
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
    fd1 *= -1;
    fb1 = !fb0;
    fd0 *= -1;
    Output.points[5][6] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought59.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    if (fb1) {
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb1 = !fb0;
        boolean lb1 = false;
        boolean lb2 = false;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(lb2, lb3, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb4 = true;
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
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    double ld0 = 140.4813329782291;
    double ld1 = 409.36660427153964;
    ld1 = fd0 - fd1;
        fb1 = ld0 < ld1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (ab4) {
        Thought lo2 = Thought98.getInstance(ld1, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
        ld1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld0 = 114.63811681458755;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    double ld1 = 279.9173755361606;
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo3 = Thought59.getInstance(fd0, fd1, ld0, ld1);
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb2, fb0, fb1);
}
        lb2 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, lb4, lb2);
}
        ad1 = ad2 + ad3;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    boolean lb0 = true;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;
    Thought lo1 = Thought71.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
    fd0 = fd1 - ad1;
    double ld2 = 553.2635910284678;

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
if(ao1 != null){
      fd1 = ao1.m3();
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
if(ao2 != null){
          fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        boolean lb0 = false;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        double ld1 = 967.4175779289623;
        Output.points[5][7] += fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        ld1 = fd0 + fd1;
        lb0 = fb0 && fb1;
        Thought lo2 = Thought54.getInstance(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
if(ao3 != null){
          ao3.m3();
}
        boolean lb3 = false;
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
    Output.points[5][8] += ad2;
    boolean lb0 = true;
    lb0 = ad3 > ad4;
    fb0 = !fb1;
    boolean lb1 = false;
    Thought lo2 = Thought26.getInstance(fd0, fd1, ad1, ad2);
if(ao2 != null){
      lb0 = ao2.m2(lb1, fb0, fb1, lb0);
}
    Thought lo3 = Thought22.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    ad1 *= -1;
    lb1 = fb0 && fb1;
    ad2 *= -1;
    Thought lo4 = Thought46.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb1, fb0, fb1);
}
    ad1 *= -1;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = ad2 > ad3;

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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
if(ao2 != null){
      ao2.m1();
}
    fb0 = fd1 < fd0;
    double ld0 = 871.2578455213464;
if(ao3 != null){
          ao3.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
    Output.points[6][0] -= ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
    fd1 = ld0 + fd0;
    ab4 = fb0 && fb1;
    lb1 = ab1 || ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[6][1] += fd1;
    Thought lo2 = Thought74.getInstance(fo1, ao1, ao2, ao3);
    Thought lo3 = Thought70.getInstance(ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
if(ao4 != null){
      fd0 = ao4.m3();
}
    Thought lo4 = Thought68.getInstance(fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    boolean lb5 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 842.5899641699955;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
    boolean lb1 = true;
    ad4 *= -1;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought30.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 *= -1;
        Thought lo4 = Thought75.getInstance(ld0, ad1, ad2, ad3);
        boolean lb5 = true;
if(ao1 != null){
          ao1.m3(lb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
          lb3 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb5, lb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        Thought lo6 = Thought22.getInstance(fo1, ao1, ao2, ao3, fb1, lb3, lb5, lb1);
        fd0 = fd1 + ld0;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
        ab1 = ab2 || ab3;
if(ao3 != null){
          ao3.m1(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb3);
}
        fd0 *= -1;
        fd1 = ld0 + ad1;
if(ao4 != null){
          lb5 = ao4.m2();
}
        lb1 = ad2 > ad3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[6][2] += fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought29.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    lb1 = fb0 && fb1;
    double ld2 = 431.3066982105884;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought9.getInstance(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb3 = !fb0;
    boolean lb5 = false;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2();
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    Thought lo1 = Thought70.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    double ld3 = 565.943094943944;
if(fo1 != null){
      fo1.m1();
}
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb2, ab1);
}
    boolean lb4 = false;
    fd0 = fd1 - ld3;
    double ld5 = 644.1933065218999;

Thought.STACK_COUNTER++;
return ld5;
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
    if (fb1) {
        fb0 = !fb1;
        Thought lo0 = Thought15.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought56.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        double ld2 = 487.2269883868969;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld3 = 709.9827703350891;
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
        ld3 = ad1 + ad2;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld2, ld3, ad1);
}
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
        ad2 *= -1;
        fb0 = ad3 > ad4;
        for(int i0=0; i0<10; i0++){
            fb1 = !fb0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3);
}
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
            boolean lb4 = true;
            lb4 = !fb0;
            double ld5 = 397.9455967604904;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb4, fb0, fb1);
}
            Thought lo6 = Thought37.getInstance(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought56.getInstance(ad3, ad4, fd0, fd1);
    boolean lb1 = false;
    double ld2 = 52.861604932587845;
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    double ld3 = 616.2981447775946;
    lb1 = !ab1;
    boolean lb4 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    lb0 = fd1 < fd0;
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    if (fb0) {
        Thought lo1 = Thought82.getInstance(fb1, lb0, fb0, fb1);
        boolean lb2 = false;
        lb2 = lb0 && fb0;
        Thought lo3 = Thought46.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
        fb1 = lb2 && lb0;
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
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld2 = 649.0861626708169;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, ad1, lb0, lb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, ad1);
}
    Output.points[6][3] += ad2;
    boolean lb3 = true;
        Thought lo4 = Thought77.getInstance(lb0, lb1, lb3, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
        double ld5 = 700.5263616018386;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && lb1;
        Thought lo6 = Thought99.getInstance(ao4, fo0, fo1, ao1, ld2, ld5, ad1, ad2, lb3, fb0, fb1, lb0);
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb0);
}
if(ao1 != null){
          ad3 = ao1.m3(ao2, ao3, ao4, fo0);
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
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    ab4 = fd0 > fd1;
    fb0 = fb1 || lb0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought18.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    ab3 = fd1 < fd0;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    Output.points[6][4] += fd1;
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    boolean lb2 = true;

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
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    ab3 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Thought lo2 = Thought62.getInstance();
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    ab4 = ad1 > ad2;
    fb0 = ad3 < ad4;
    Thought lo3 = Thought0.getInstance(fb1, lb0, lb1, ab1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo4 = Thought56.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 || ab4;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    double ld0 = 533.3686535274053;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    double ld1 = 220.44037649243015;

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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought19.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought3.getInstance(fb0, fb1, ab1, ab2);
    fd1 = fd0 + fd1;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    fb0 = ad1 < ad2;
    double ld0 = 510.729750075613;
    Output.points[6][5] -= ad2;
    ad3 *= -1;
    double ld1 = 186.58775080842432;
    if (fb1) {
        fb0 = !fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld1, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
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
    ab1 = ad2 > ad3;
    ab2 = !ab3;
    ad4 *= -1;
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fd0 > fd1;
        boolean lb0 = true;
        boolean lb1 = false;
        ad1 *= -1;
        boolean lb2 = false;
        ab3 = !ab4;
        Output.points[6][6] += ad2;
        fb0 = !fb1;
        Thought lo3 = Thought19.getInstance(ad3, ad4, fd0, fd1);
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
    fb0 = !fb1;
    boolean lb0 = false;
        double ld1 = 919.8259304262966;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought85.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4);
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
      fb0 = ao2.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought75.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    Thought lo1 = Thought75.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
        Output.points[6][7] -= ad2;
    Output.points[6][8] += ad3;
    lb3 = fb0 && fb1;
    lb2 = lb3 && fb0;
    Thought lo4 = Thought25.getInstance(ao3, ao4, fo0, fo1, fb1, lb2, lb3, fb0);
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, lb2, lb3, fb0);
}
    double ld5 = 253.27938557492087;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Output.points[7][0] -= fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld5, ad1, ad2);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fb1, lb2, lb3, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld5, ad1, ad2, ad3);
}
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld5, ad1, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, ao1, ao2, ao3, lb2, lb3, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought13.getInstance();
    Thought lo1 = Thought6.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(fb0, fb1, ab1, ab2);
}
    double ld2 = 171.59034180685296;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo4 = Thought40.getInstance(ao2, ao3, ao4, fo0);
    Output.points[7][1] += fd1;
    ld2 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2, lb3, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4();
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
    double ld0 = 936.1569591030512;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    Output.points[7][2] -= fd0;
    boolean lb1 = true;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought83.getInstance(ao2, ao3, ao4, fo0, fb1, lb1, lb2, ab1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld0 = ad1 + ad2;
    Thought lo4 = Thought92.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      ld0 = fo1.m3();
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
if(ao3 != null){
          ld0 = ao3.m3(lb1, lb2, ab1, ab2);
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
    fd1 = fd0 + fd1;
    double ld0 = 858.1979747424875;
    Thought lo1 = Thought8.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    double ld2 = 886.5395983961886;
    ld2 = fd0 + fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
    ld2 = fd0 - fd1;
    fb1 = lb3 || fb0;
    ld0 *= -1;

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
    Thought lo0 = Thought85.getInstance(fo1, fo0, fo1, fo0);
    Output.points[7][3] += fd1;
    fb0 = !fb1;
    double ld1 = 624.9200752683681;
    double ld2 = 61.061313284017515;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    double ld3 = 684.4388872890734;
    ld1 = ld2 - ld3;

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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fd1 > fd0;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    Thought lo2 = Thought14.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = !lb1;
        fb0 = fd1 > fd0;
    Thought lo3 = Thought11.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
    fb1 = fd1 < fd0;

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
