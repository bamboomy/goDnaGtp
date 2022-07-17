package genetic;
import java.util.ArrayList;
class Thought0 extends Thought{
private static ArrayList<Thought0> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 155.7764589975427;
private double fd1 = 270.73361508190237;
private Thought fo0 = null;
private Thought fo1 = null;
Thought0 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought0 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought0 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought0 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought0 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    if (fb1) {
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        fd0 *= -1;
        fd1 *= -1;
        boolean lb0 = true;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd1 = fd0 - fd1;
        fd0 *= -1;
        fb1 = lb0 || fb0;
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
    boolean lb0 = true;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m1();
}
        Output.points[0][0] += fd1;
        ab4 = fd0 < fd1;
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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought118.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fd0 < fd1;
        fb1 = !lb1;
        fb0 = fb1 || lb1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fb0 = fd0 > fd1;
        } else if (fb1) {
        double ld2 = 103.28348305219201;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
        fb0 = fb1 && lb1;
if(fo1 != null){
          fb0 = fo1.m2(ad4, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
        ad1 = ad2 + ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ld2 = ad1 + ad2;
        fb1 = lb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
        fb0 = ld2 < ad1;
        fb1 = !lb1;
        fb0 = fb1 || lb1;
        fb0 = ad2 > ad3;
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
    Output.points[0][1] -= ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    double ld0 = 846.2896838771197;
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4);
}
    ab2 = ab3 && ab4;
    Thought lo1 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ld0 = ad1 - ad2;
    ad3 *= -1;
    double ld2 = 477.2641711312647;
    double ld3 = 90.69702256507888;
    Thought lo4 = Thought302.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld5 = 365.1559961459347;
    Output.points[0][2] += ad4;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 687.9189948350056;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 || fb1;
        fd1 = ld0 + fd0;
    fb0 = !fb1;
    fd1 = ld0 - fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
        ad3 = ad4 - fd0;
    Thought lo0 = Thought268.getInstance(fd1, ad1, ad2, ad3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld1 = 106.39972042095424;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[0][3] -= fd0;
    fd1 = ld1 - ad1;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
        fb1 = fb0 && fb1;
        Output.points[0][4] -= ld1;
        Thought lo2 = Thought185.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
}
        boolean lb3 = true;
        ad2 = ad3 - ad4;
if(fo1 != null){
          lb3 = fo1.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb3, fb0);
}
        ad2 = ad3 + ad4;
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
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[0][5] -= fd0;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        boolean lb0 = false;
        Thought lo1 = Thought43.getInstance();
        Output.points[0][6] -= fd0;
        ab4 = fb0 && fb1;
        double ld2 = 564.4167194382247;
        fd0 = fd1 - ld2;
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, lb0, lb3, ab1, ab2);
}
        ab3 = fd1 < ld2;
        Thought lo4 = Thought188.getInstance(ab4, fb0, fb1, lb0);
        Output.points[0][7] += fd0;
        boolean lb5 = true;
        lb3 = !lb5;
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    ab1 = ab2 || ab3;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    Thought lo1 = Thought173.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    double ld2 = 127.4508065557784;
    double ld3 = 31.097481864139734;
    Thought lo4 = Thought239.getInstance();
    ad3 *= -1;
    Thought lo5 = Thought382.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld2, lb0, ab1, ab2, ab3);
    boolean lb6 = false;
    Thought lo7 = Thought52.getInstance(ab3, ab4, fb0, fb1);

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
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought122.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[0][8] += fd1;
    Thought lo2 = Thought200.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;

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
    fd0 *= -1;
    fd1 *= -1;
    ab1 = fd0 > fd1;
        boolean lb0 = true;
    double ld1 = 614.3335919406253;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    Thought lo2 = Thought158.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
    Output.points[1][0] += fd0;
    boolean lb3 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Output.points[1][1] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][2] += ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld0 = 335.82108641502407;
if(fo1 != null){
      ad2 = fo1.m3(fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    Output.points[1][3] += fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
        ab3 = ab4 && fb0;
    fb1 = ad2 < ad3;
    if (ab1) {
if(fo0 != null){
          ab2 = fo0.m2(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        double ld0 = 499.2212403643614;
        double ld1 = 174.61623792452312;
        for(int i0=0; i0<10; i0++){
            ld1 = ad1 - ad2;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
            fb0 = fb1 && ab1;
if(fo0 != null){
              fo0.m1();
}
            boolean lb2 = true;
            ab1 = ab2 || ab3;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
            ab1 = ab2 && ab3;
            Thought lo3 = Thought42.getInstance(ab4, fb0, fb1, lb2);
            double ld4 = 989.7665110335034;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought102.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
    double ld3 = 655.7169511255753;
    fb0 = ld3 < fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ld3 + fd0;
    fb1 = fd1 < ld3;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1, lb0, lb2, fb0, fb1);
}
    boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb2, lb4, fb0);
}
    ld3 = fd0 - fd1;

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
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
    ad4 = fd0 + fd1;
    Output.points[1][4] -= ad1;
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
    Output.points[1][5] -= ad4;
    fd0 = fd1 + ad1;
    boolean lb0 = false;
    Thought lo1 = Thought234.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    Thought lo2 = Thought389.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab2 = !ab3;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    Thought lo1 = Thought37.getInstance(ao3, ao4, fo0, fo1);
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;

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
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
        } else if (ab3) {
        ab4 = ad3 < ad4;
if(ao4 != null){
          fd0 = ao4.m3();
}
        fd1 = ad1 - ad2;
        ad3 = ad4 - fd0;
        fd1 *= -1;
        ad1 = ad2 + ad3;
        fb0 = !fb1;
        lb0 = ad4 > fd0;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
        ad4 *= -1;
        } else if (fb0) {
        fb1 = fd0 < fd1;
        Output.points[1][6] += ad1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = false;
    Output.points[1][7] -= fd1;
    fb0 = !fb1;
    boolean lb1 = false;
if(fo1 != null){
          lb0 = fo1.m2(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[1][8] -= fd0;
    double ld2 = 866.8564903839282;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought227.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld2 = 841.7580968851074;
    fb0 = !fb1;
    Output.points[2][0] += ld2;
    boolean lb3 = true;
    double ld4 = 211.682851343989;
    lb1 = lb3 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(ld4, fd0, fd1, ld2);
}
    ld4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld2, ld4, fd0, fd1);
}
    ab3 = ld2 > ld4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, ld4, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    Output.points[2][1] -= fd1;

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
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[2][2] += fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb1 = lb0 || fb0;
    fd1 = ad1 + ad2;
    Output.points[2][3] += ad3;
    boolean lb1 = false;
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    lb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = lb2 || fb0;
    Thought lo3 = Thought189.getInstance(fd1, ad1, ad2, ad3);
    ad4 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo4 = Thought84.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
    fb0 = ad1 < ad2;
    ad3 *= -1;
    Output.points[2][4] -= ad4;
    fd0 = fd1 + ad1;
    double ld5 = 961.1897821204575;
    ad1 = ad2 - ad3;
    Thought lo6 = Thought298.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);

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
    ad2 = ad3 + ad4;
    double ld0 = 293.0333702534342;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 636.327023476376;
if(fo1 != null){
      ad3 = fo1.m3();
}
    lb2 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld3, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 > ad3;
    fb1 = lb1 || lb2;
    ad4 *= -1;
    double ld4 = 918.5052972647878;
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld4, ad1, ad2);
}
    Thought lo5 = Thought180.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    double ld0 = 140.99306083432273;
    fb0 = !fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fb0 = !fb1;
    if (fb0) {
        } else {
        Output.points[2][5] -= fd1;
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
    if (fb1) {
        ad2 = ad3 - ad4;
if(ao1 != null){
          fd0 = ao1.m3();
}
        Thought lo0 = Thought299.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
        fb0 = !fb1;
        fb0 = ad4 > fd0;
        } else if (fb1) {
        fb0 = fb1 && fb0;
        double ld1 = 264.45201325755085;
if(ao1 != null){
          fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        fb1 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, ad1);
}
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        fb1 = ld1 < ad1;
if(ao2 != null){
          fb0 = ao2.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought369.getInstance();
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
              ad4 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
              ao4 = fo0.m4(fd0, fd1, ld1, ad1);
}
            boolean lb3 = false;
            Output.points[2][6] -= ad2;
            boolean lb4 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 294.5347627283319;
    Thought lo1 = Thought59.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = ad2 < ad3;
        ad4 = fd0 - fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
    double ld0 = 171.07310027548434;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    ld0 = ad1 - ad2;
if(ao3 != null){
      fb1 = ao3.m2();
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    Output.points[2][7] -= fd0;
    fd1 *= -1;
    double ld1 = 977.4452955395066;
    lb0 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld2 = 615.7849411310981;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
    fb1 = lb0 || fb0;
    ld2 = fd0 - fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1, fb0, fb1, lb0, lb3);
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
    Thought lo0 = Thought279.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    Thought lo1 = Thought319.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb2;
    double ld3 = 736.0968457938114;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = !fb1;
    lb2 = ab1 || ab2;
    ab3 = fd1 < ld3;

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
        double ld0 = 431.3589046697988;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 916.8042354539915;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
    boolean lb2 = true;
    fd0 = fd1 - ld0;
    ld1 = ad1 + ad2;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb2, lb3, fb0, fb1);
}
    ld0 *= -1;
    double ld4 = 334.5370563182006;
    ld1 = ld4 + ad1;
    lb2 = lb3 || fb0;
    Thought lo5 = Thought22.getInstance(fo1, fo0, fo1, fo0, fb1, lb2, lb3, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld6 = 859.163593948335;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb2, lb3, fb0);
}
    double ld7 = 128.69974100735502;

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
        ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = fd1 > ad1;
    double ld0 = 738.0915960262421;
    ad1 *= -1;
    Output.points[2][8] -= ad2;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
        ld0 = ad1 - ad2;
    ab1 = ad3 < ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    double ld3 = 174.3376917650243;
    fb0 = fb1 && lb1;
    Output.points[3][0] -= ld0;
    Output.points[3][1] += ld3;

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
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought70.getInstance();
    fb0 = fb1 || fb0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;

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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 890.7330346613592;
    fb1 = ad3 < ad4;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    if (fb1) {
        boolean lb1 = false;
        } else {
        boolean lb2 = true;
        lb2 = fb0 && fb1;
        boolean lb3 = false;
if(ao3 != null){
          ao2 = ao3.m4(ld0, ad1, ad2, ad3);
}
        lb2 = ad4 < fd0;
        lb3 = fd1 > ld0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
        double ld4 = 100.39918610033587;
        Thought lo5 = Thought166.getInstance(ad4, fd0, fd1, ld4, fb0, fb1, lb2, lb3);
        boolean lb6 = false;
        boolean lb7 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb6, lb7, fb0, fb1);
}
        ld0 = ad1 - ad2;
        ad3 = ad4 - fd0;
        fd1 = ld4 - ld0;
        ad1 = ad2 + ad3;
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
      ao1 = ao2.m4();
}
        double ld0 = 380.69180289656725;
    double ld1 = 968.9447965758035;
    ab1 = ab2 || ab3;
    Output.points[3][2] += ld1;
    boolean lb2 = true;
    ab3 = ab4 && fb0;
    Output.points[3][3] -= fd0;
    boolean lb3 = true;
    fd1 = ld0 + ld1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, fb0, fb1, lb2, lb3);
}
    Output.points[3][4] -= fd0;
    Thought lo4 = Thought241.getInstance(ab1, ab2, ab3, ab4);
    boolean lb5 = false;
    ab4 = fb0 || fb1;
        lb2 = lb3 || lb5;
    Thought lo6 = Thought16.getInstance(ao2, ao3, ao4, fo0);
    ab1 = fd1 < ld0;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld0);
}
    ab2 = !ab3;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld0, fb1, lb2, lb3, lb5);
}
    Output.points[3][5] += ld1;
    ab1 = !ab2;
    fd0 = fd1 - ld0;
    ab3 = ab4 && fb0;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ad2 = ao2.m3();
}
    ad3 = ad4 - fd0;
    fb0 = fb1 || ab1;
        fd1 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought288.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
if(ao1 != null){
      fb1 = ao1.m2(lb0, ab1, ab2, ab3);
}
    ad1 *= -1;
    ab4 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    double ld2 = 850.417540292894;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    boolean lb3 = false;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb3);
}
    boolean lb4 = true;
    fd0 = fd1 - ld2;
    Thought lo5 = Thought19.getInstance();

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
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb0 = false;
    double ld1 = 582.9652398386975;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Output.points[3][6] += fd1;
    ld1 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    Output.points[3][7] += fd0;
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
    fd1 = ld1 + fd0;
    fb0 = fb1 || lb0;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Thought lo0 = Thought351.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    double ld1 = 537.0023180996017;
    Output.points[3][8] += fd0;
    fb1 = fd1 > ld1;
    Thought lo2 = Thought260.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
    Thought lo0 = Thought135.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    double ld3 = 304.9208593186149;
    Output.points[4][0] += ld3;
    lb2 = fd0 > fd1;
    ld3 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
    double ld4 = 85.13419920206665;
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
}
