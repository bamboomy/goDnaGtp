package genetic;
import java.util.ArrayList;
class Thought7 extends Thought{
private static ArrayList<Thought7> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 460.40092629868604;
private double fd1 = 530.5173742535741;
private Thought fo0 = null;
private Thought fo1 = null;
Thought7 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought7 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought7 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought7 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought7 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Output.points[3][6] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought95.getInstance(fb0, fb1, fb0, fb1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 704.5237425795893;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 > ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab3 = fd0 > fd1;
        ab4 = fb0 && fb1;
        Output.points[3][7] -= ld0;
        fd0 = fd1 + ld0;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought56.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
        Thought lo2 = Thought24.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
        ab4 = fb0 && fb1;
        fd0 = fd1 + ld0;
        ab1 = ab2 && ab3;
        ab4 = fd0 > fd1;
if(fo1 != null){
          fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
        ab4 = ld0 > fd0;
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
    double ld0 = 99.19455704088124;
    fb0 = fb1 || fb0;
    ld0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = ld0 - ad1;
    boolean lb1 = true;
    lb1 = ad2 > ad3;
    Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || lb1;
    Thought lo3 = Thought17.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    Output.points[3][8] -= ad1;
    fb1 = lb1 && fb0;
    boolean lb4 = false;
    Output.points[4][0] -= ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb1 = fo0.m2(lb4, fb0, fb1, lb1);
}
    Thought lo5 = Thought56.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2, lb4, fb0, fb1, lb1);
}
    ad3 = ad4 - fd0;
        lb4 = fd1 < ld0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[4][1] -= ad2;

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
    ab1 = ab2 || ab3;
    double ld0 = 908.2405979686816;
    if (ab4) {
        fb0 = ad1 > ad2;
        ad3 *= -1;
        Output.points[4][2] += ad4;
        fd0 *= -1;
        fb1 = ab1 && ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Output.points[4][3] += ld0;
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
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    double ld0 = 136.13232486499794;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    double ld1 = 510.40904163317424;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    if (lb2) {
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
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld0 = 431.35645165697895;
        }
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    double ld1 = 542.6366326846647;
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought21.getInstance(fd0, fd1, ld1, ad1);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    boolean lb3 = false;

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
    Output.points[4][4] += fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab3 = !ab4;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = !ab1;
    boolean lb0 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    Output.points[4][5] -= ad4;
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    lb0 = ad4 > fd0;
    ab1 = fd1 < ad1;

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
      fd1 = fo0.m3();
}
    if (fb0) {
        fb1 = !fb0;
        boolean lb0 = false;
        boolean lb1 = true;
        boolean lb2 = false;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
        boolean lb3 = false;
        double ld4 = 242.9412345923207;
        lb0 = !lb1;
        lb2 = fd0 > fd1;
        lb3 = !fb0;
        ld4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, fb1, lb0, lb1, lb2);
}
        fd0 = fd1 + ld4;
        lb3 = fb0 && fb1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, lb2, lb3);
}
        Thought lo5 = Thought90.getInstance(fd1, ld4, fd0, fd1);
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4);
}
        fb1 = !lb0;
if(fo0 != null){
          lb1 = fo0.m2(lb2, lb3, fb0, fb1);
}
        fd0 = fd1 - ld4;
        boolean lb6 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld7 = 419.94377772573034;
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
    fd1 = fd0 - fd1;
    Thought lo0 = Thought51.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld1 = 948.6796848410975;
    Thought lo2 = Thought93.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    Thought lo4 = Thought97.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
        ld1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    ld1 *= -1;
    fb1 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld1 - fd0;
    fb0 = !fb1;
    boolean lb5 = false;
    if (lb3) {
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought76.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought10.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    Thought lo2 = Thought84.getInstance();

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
    if (ab2) {
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        ad3 = ad4 - fd0;
        ab1 = fd1 > ad1;
        boolean lb0 = true;
        boolean lb1 = true;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        if (lb0) {
            ad4 = fd0 - fd1;
            ad1 = ad2 - ad3;
            Thought lo3 = Thought67.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
            double ld4 = 32.372978311409916;
            lb1 = lb2 && ab1;
            ad1 *= -1;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    double ld0 = 579.7684333376812;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[4][6] += fd0;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought6.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0);
}
    boolean lb2 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb2, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = !fb0;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2();
}
    boolean lb2 = true;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    Thought lo4 = Thought68.getInstance(ad4, fd0, fd1, ad1);
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao3.m2(lb0, lb1, lb2, lb3);
}
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m2();
}
        ad2 *= -1;
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
    ab2 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 657.664427398199;
    double ld1 = 56.16935615750578;
    ab1 = ab2 && ab3;
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab4 = !fb0;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, fb0, fb1, lb2, ab1);
}
    ab2 = ld1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(fd1, ld0, ld1, fd0);
}
    double ld3 = 268.9419205047288;
    fd0 *= -1;
    lb2 = !ab1;
    ab2 = ab3 || ab4;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, ld1, ld3, fd0);
}
    Thought lo4 = Thought88.getInstance(fb0, fb1, lb2, ab1);
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ld3, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = lb2 || ab1;
    fd0 = fd1 + ld0;
    ab2 = ab3 && ab4;
    fb0 = ld1 < ld3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1, fb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      ld3 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb2, ab1, ab2);
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
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    Output.points[4][7] += fd1;
    Output.points[4][8] -= ad1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > ad1;
if(ao4 != null){
      ao4.m3();
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[5][0] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3();
}
    fd1 *= -1;
    double ld1 = 574.4444389863988;
    for(int i0=0; i0<10; i0++){
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    double ld1 = 403.9149600283263;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
        double ld2 = 988.7045574725606;
        fb1 = !lb0;
        Output.points[5][1] -= fd0;
        Thought lo3 = Thought72.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
        fd1 = ld2 + ld1;
        fb1 = fd0 > fd1;
        lb0 = ld2 < ld1;
        boolean lb4 = true;
        Thought lo5 = Thought61.getInstance(fd0, fd1, ld2, ld1);
        lb0 = !fb0;
        Thought lo6 = Thought39.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld1);
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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    fd0 *= -1;
    Output.points[5][2] -= fd1;
    Thought lo0 = Thought11.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m2();
}
    Thought lo1 = Thought33.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    Thought lo2 = Thought19.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[5][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = true;
if(fo1 != null){
      lb3 = fo1.m2(fd1, fd0, fd1, fd0, lb4, ab1, ab2, ab3);
}
    Thought lo5 = Thought36.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][4] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb3);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    fb0 = ad1 < ad2;
    ad3 *= -1;
    Output.points[5][5] += ad4;
    fb1 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought6.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
    fb0 = ad4 > fd0;
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
        Output.points[5][6] -= fd1;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    ad4 = fd0 + fd1;
    lb0 = fb0 || fb1;

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
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    Thought lo1 = Thought63.getInstance(fd0, fd1, ad1, ad2);
    boolean lb2 = true;
    lb0 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[5][7] += ad1;
    ab1 = ab2 && ab3;
    ad2 = ad3 + ad4;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = fb0 || fb1;
    fd0 = fd1 + ad1;
if(fo1 != null){
      lb0 = fo1.m2(ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought27.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    if (ab4) {
if(fo0 != null){
          fd1 = fo0.m3(fb0, fb1, lb0, lb2);
}
        ad1 = ad2 - ad3;
        ab1 = !ab2;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          ab3 = fo0.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
        Thought lo4 = Thought78.getInstance(fo1, fo0, fo1, fo0);
        Output.points[5][8] -= ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fd1 > fd0;
    double ld2 = 247.4163971885604;
    Thought lo3 = Thought77.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, fd0, fd1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 687.1168187960241;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    double ld2 = 636.4068676810921;
    lb0 = fb0 && fb1;
    Output.points[6][0] -= ld2;
    Thought lo3 = Thought12.getInstance(ad1, ad2, ad3, ad4);
    boolean lb4 = false;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    fd1 *= -1;
    double ld0 = 960.4880877247598;
    boolean lb1 = true;
if(ao4 != null){
      ao4.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
        ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;
    fd0 = fd1 - ld0;
    if (ab4) {
        fb0 = fb1 && lb1;
        lb2 = ab1 || ab2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = ld0 - fd0;
        if (lb1) {
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
    boolean lb0 = false;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4);
}
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    Thought lo2 = Thought99.getInstance(lb1, ab1, ab2, ab3);
if(ao1 != null){
      ab4 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
        Thought lo3 = Thought47.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought87.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    double ld5 = 222.86658945927053;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][1] -= fd1;
    Thought lo0 = Thought70.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = fd1 < fd0;
    Thought lo3 = Thought56.getInstance();
    double ld4 = 839.7408420639979;
    boolean lb5 = true;
    fd0 = fd1 - ld4;
    double ld6 = 778.1063039098348;
    ld6 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld4, ld6, fd0, fd1, lb5, fb0, fb1, lb1);
}
    lb2 = ld4 > ld6;
    fd0 *= -1;

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
    double ld0 = 306.89611726519666;
    boolean lb1 = true;
    fd0 = fd1 + ld0;
    double ld2 = 573.22381990151;
    lb1 = !ab1;
    ld2 *= -1;
    Thought lo3 = Thought49.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, ab2, ab3, ab4, fb0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb4);
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
}
    boolean lb6 = true;
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
    double ld0 = 976.6549890878074;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought96.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Thought lo2 = Thought83.getInstance();
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    double ld3 = 623.0110526761057;
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2(ld3, ad1, ad2, ad3, fb0, fb1, lb4, fb0);
}
    fb1 = !lb4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought75.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb4, fb0);
    ld3 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb6 = false;
    lb4 = ld0 < ld3;
if(fo0 != null){
      lb6 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;

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
    ad1 *= -1;
    Thought lo0 = Thought61.getInstance(ab1, ab2, ab3, ab4);
    if (fb0) {
        ad2 = ad3 + ad4;
        fd0 *= -1;
        boolean lb1 = true;
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo0.m2();
}
        ad3 = ad4 + fd0;
        Output.points[6][2] += fd1;
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = !fb0;
    Thought lo1 = Thought54.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    double ld2 = 771.9788861581291;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
if(ao4 != null){
      ao4.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2();
}
    fb1 = ld2 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought2.getInstance(ao2, ao3, ao4, fo0);
    boolean lb4 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2, lb4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb4, fb0, fb1, lb0);
}
    lb4 = fb0 || fb1;
    lb0 = lb4 && fb0;
    fd0 *= -1;
    fb1 = fd1 > ld2;
    boolean lb5 = false;
    boolean lb6 = false;
    lb0 = fd0 > fd1;
    lb4 = !lb5;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 332.5290154607307;
    fd0 = fd1 + ld0;
    fb1 = ad1 > ad2;
    fb0 = !fb1;
    Thought lo1 = Thought0.getInstance();
if(ao3 != null){
      fb0 = ao3.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb2, fb0, fb1);
}
if(ao4 != null){
      lb2 = ao4.m2(ad4, fd0, fd1, ld0);
}
    double ld3 = 996.8839607902424;
    fb0 = fb1 || lb2;
    fb0 = ld3 < ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    lb2 = fd1 < ld0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb2, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][3] += fd1;
    fd0 *= -1;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
    Thought lo0 = Thought14.getInstance();
    ab4 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought12.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    Output.points[6][4] += ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb0, lb1, ab1);
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
          fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    Thought lo1 = Thought61.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    lb0 = fd0 > fd1;
    Output.points[6][5] -= fd0;
    fd1 = fd0 - fd1;
    Output.points[6][6] += fd0;
    boolean lb2 = false;
    lb2 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb2, fb0);
}
    fd0 *= -1;
    fb1 = lb0 || lb2;
    Thought lo3 = Thought65.getInstance();
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[6][7] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 *= -1;
    lb0 = !lb1;
    fd0 = fd1 + fd0;
    double ld2 = 529.263418369641;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = ld2 + fd0;
    fb0 = !fb1;
    fd1 = ld2 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    Output.points[6][8] += fd1;

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
    boolean lb0 = false;
    Thought lo1 = Thought11.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought45.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought47.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < fd0;

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
