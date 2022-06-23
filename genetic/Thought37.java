package genetic;
import java.util.ArrayList;
class Thought37 extends Thought{
private static ArrayList<Thought37> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 257.6494680383093;
private double fd1 = 731.8575388516568;
private Thought fo0 = null;
private Thought fo1 = null;
Thought37 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought37 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought37 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought37 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought37 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought10.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 440.2408084141671;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1();
}
    boolean lb2 = false;
    double ld3 = 258.9661886579365;

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
    if (ab2) {
        Output.points[7][7] += fd0;
        Output.points[7][8] -= fd1;
if(fo1 != null){
          fo1.m1(ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought79.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
        Thought lo1 = Thought36.getInstance(fo1, fo0, fo1, fo0);
        Output.points[8][0] -= fd0;
        Output.points[8][1] += fd1;
        } else if (fb0) {
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 *= -1;
        double ld2 = 592.5383341921273;
        fd0 = fd1 - ld2;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
        ab1 = ab2 || ab3;
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
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 530.0751549277811;
    fb1 = ad4 < fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = ld0 - ad1;
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[8][2] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0, lb2, lb3, fb0, fb1);
}
    Output.points[8][3] -= ad1;
    lb1 = ad2 > ad3;
    Thought lo4 = Thought24.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld0);
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
    ab2 = ab3 || ab4;
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        ab4 = fd0 < fd1;
    Thought lo0 = Thought58.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    Output.points[8][4] -= fd0;
    ab3 = ab4 || fb0;
    double ld1 = 554.174299212014;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        boolean lb1 = true;
    double ld2 = 511.78492678514635;
    Output.points[8][5] -= fd0;
    boolean lb3 = true;
    lb0 = lb1 && lb3;
    fb0 = fb1 && lb0;
    Thought lo4 = Thought16.getInstance();
    Output.points[8][6] += fd1;
    ld2 = fd0 - fd1;
    boolean lb5 = false;
    lb1 = ld2 > fd0;
    fd1 = ld2 - fd0;
    boolean lb6 = false;
    fd1 = ld2 - fd0;
    fd1 = ld2 - fd0;
    lb3 = !lb5;
if(ao3 != null){
      ao3.m2(fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;

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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    double ld0 = 897.8085135880526;
    fd0 = fd1 + ld0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld1 = 596.1206221109518;
    ld1 = ad1 - ad2;
    fb1 = ad3 < ad4;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    Output.points[8][7] += ld0;
if(ao1 != null){
          ld1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    boolean lb2 = true;
    ad3 = ad4 - fd0;

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
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][8] += fd0;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = fd1 < fd0;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
        fd0 = fd1 - fd0;
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        Thought lo0 = Thought92.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
        ab4 = fd1 > fd0;
        fb0 = fd1 < fd0;
        Thought lo1 = Thought13.getInstance();
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
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab3 = !ab4;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        lb1 = ad4 > fd0;
        lb2 = !ab1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab2 = ab3 || ab4;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
        ad4 = fd0 + fd1;
        Thought lo3 = Thought79.getInstance();
        lb2 = ab1 || ab2;
if(ao4 != null){
          ab3 = ao4.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb0);
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
    Thought lo0 = Thought31.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
    double ld2 = 265.4025918574964;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0);
}
    Output.points[0][0] -= fd1;
    ld2 *= -1;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    lb1 = fd0 < fd1;
    Thought lo4 = Thought55.getInstance(lb3, fb0, fb1, lb1);
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb1, lb3);
}
    double ld5 = 807.1085415734236;
    boolean lb6 = false;
    lb6 = fb0 && fb1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 470.7060520327485;
    double ld1 = 117.82778069249687;
    ab2 = ld0 > ld1;
    Thought lo2 = Thought80.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld0;
    ab2 = ld1 > fd0;
if(fo1 != null){
      ab3 = fo1.m2(fd1, ld0, ld1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld0;
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld1 *= -1;
        Thought lo3 = Thought81.getInstance(fd0, fd1, ld0, ld1);
        ab4 = fb0 && fb1;
        ab1 = !ab2;
        if (ab3) {
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought14.getInstance(fb0, fb1, fb0, fb1);
            boolean lb1 = true;
    lb1 = ad1 < ad2;
    fb0 = fb1 || lb1;
    fb0 = ad3 > ad4;
    Output.points[0][1] += fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought21.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;
    lb1 = fb0 || fb1;
    lb1 = !fb0;
    fb1 = !lb1;
if(fo1 != null){
          fd0 = fo1.m3();
}
    Thought lo3 = Thought23.getInstance(fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    ad4 *= -1;
    Output.points[0][2] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    double ld0 = 681.9966692859323;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld1 = 820.2771817207251;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ld1 < ad1;
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 + ld1;
    double ld2 = 304.49954198454606;
    ld2 = ad1 - ad2;
    Thought lo3 = Thought22.getInstance();
    ab3 = !ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    ld1 = ld2 + ad1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ld0;
    ab1 = ld1 < ld2;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;

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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought16.getInstance();
    Thought lo1 = Thought53.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = ad3 > ad4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = !lb2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
        Output.points[0][3] -= fd0;
        double ld3 = 489.9066717832915;
        double ld4 = 113.2931293839101;
        ad4 *= -1;
        for(int i1=0; i1<10; i1++){
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb2, fb0, fb1);
}
            lb2 = fd0 > fd1;
            boolean lb5 = true;
            lb2 = fb0 && fb1;
            ld3 = ld4 + ad1;
            ad2 = ad3 + ad4;
            Thought lo6 = Thought86.getInstance(ao3, ao4, fo0, fo1);
            lb5 = fd0 > fd1;
if(ao2 != null){
              ao1 = ao2.m4(ld3, ld4, ad1, ad2, lb2, fb0, fb1, lb5);
}
if(ao4 != null){
              ao3 = ao4.m4();
}
            Output.points[0][4] -= ad3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought3.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fb1 = !ab1;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought98.getInstance(fo1, ao1, ao2, ao3);
    ab2 = ab3 && ab4;
    Output.points[0][5] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
    double ld2 = 768.2131830878575;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought91.getInstance(ab4, fb0, fb1, ab1);
    boolean lb4 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][6] -= ad1;
    ad2 = ad3 - ad4;
    ab1 = ab2 && ab3;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[0][7] += ad1;
    boolean lb0 = false;
    Thought lo1 = Thought51.getInstance(fo1, ao1, ao2, ao3);
    Thought lo2 = Thought78.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    fd1 = ad1 - ad2;
    Output.points[0][8] -= ad3;
    Thought lo3 = Thought0.getInstance();
    ab4 = !fb0;
    fb1 = !lb0;

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
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought73.getInstance();
    Output.points[1][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought44.getInstance(fb1, lb0, fb0, fb1);
    lb0 = !fb0;
    fb1 = !lb0;
    fb0 = fb1 && lb0;
        fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[1][1] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 732.9507809929191;
    fd0 = fd1 + ld0;
    ab1 = ab2 || ab3;
        fd0 = fd1 + ld0;
    ab4 = fd0 > fd1;
    Thought lo1 = Thought34.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld2 = 270.10163686428433;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = ad2 < ad3;
    double ld0 = 116.85336991293221;
    boolean lb1 = true;
    Thought lo2 = Thought34.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    boolean lb3 = false;
    Thought lo4 = Thought26.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb3, fb0, fb1, lb1);
    lb3 = !fb0;
    fb1 = ad4 > fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb1);
}
    lb3 = fd1 < ld0;
    fb0 = !fb1;
    lb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, lb3, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1();
}
    lb3 = ad1 > ad2;
if(fo1 != null){
              ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb3, fb0, fb1);
}
    lb1 = !lb3;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb5 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb5, fb0, fb1, lb1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    fb1 = ab1 || ab2;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1);
    ab3 = ab4 && fb0;
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    double ld1 = 464.2222617816248;
    ad2 = ad3 - ad4;
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    ab1 = ab2 && ab3;
    fd0 *= -1;
    boolean lb3 = false;
    ab3 = ab4 && fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 12.502792750281502;
    double ld1 = 933.0359570195261;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
    ld0 = ld1 - fd0;
    fd1 = ld0 + ld1;
    Thought lo3 = Thought25.getInstance(fd0, fd1, ld0, ld1);
    fb0 = !fb1;
    lb2 = fb0 || fb1;
    double ld4 = 492.81933450110495;
if(ao3 != null){
      ld4 = ao3.m3(lb2, fb0, fb1, lb2);
}
    Thought lo5 = Thought36.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);

Thought.STACK_COUNTER++;
return ld4;
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
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought82.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought96.getInstance();
    boolean lb2 = false;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, fb0);
}
    Output.points[1][2] += ad3;
    ad4 *= -1;
    Output.points[1][3] += fd0;
    double ld3 = 502.2785337272486;

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
    fd0 *= -1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    Thought lo0 = Thought41.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo1 = Thought14.getInstance(fd0, fd1, fd0, fd1);

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
    Thought lo0 = Thought5.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 *= -1;
    ab4 = ad2 < ad3;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
    Output.points[1][4] -= ad4;
    if (ab4) {
        fd0 = fd1 - ad1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fb0 = ao1.m2(ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld0 = 266.54734927721745;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought37.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
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
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    double ld0 = 406.5283840538256;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = fd1 > ld0;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
    fd0 = fd1 + ld0;
    Output.points[1][5] += fd0;
    fd1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    fd0 = fd1 - ld0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld3 = 612.7512402536663;
    ab1 = ab2 && ab3;

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
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    ad1 *= -1;
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    if (fb1) {
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo1.m3(fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
        ad4 = fd0 - fd1;
        ad1 = ad2 + ad3;
        fb0 = fb1 || lb0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Output.points[1][6] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab2 = ad4 < fd0;
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    ab2 = ab3 && ab4;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought47.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
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
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(ao4 != null){
      fb0 = ao4.m2();
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought15.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    if (fb1) {
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
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought20.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
    Output.points[1][7] -= ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2();
}
    boolean lb2 = true;
    lb1 = lb2 || fb0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    Output.points[1][8] += ad1;
    fb1 = !lb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
    lb0 = lb1 || ab1;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    lb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb0);
}
    if (lb1) {
        fd1 = fd0 - fd1;
        ab1 = ab2 && ab3;
        double ld2 = 394.13313145367465;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought9.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab2 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    lb0 = ad3 > ad4;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      ao1.m2(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought11.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    lb0 = fd1 < ad1;

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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought62.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld2 = 48.55491504113728;
    fb0 = !fb1;
    lb0 = ld2 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd1 = ld2 + fd0;

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
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 891.402047364347;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 = ld1 - fd0;
    Thought lo2 = Thought84.getInstance();
    fb0 = fd1 > ld1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    double ld3 = 896.5136481273908;
    ld3 = fd0 + fd1;
    ld1 = ld3 - fd0;
    Output.points[2][0] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    Output.points[2][1] -= ld1;
    ld3 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld3, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld4 = 13.434501667310924;
if(fo0 != null){
      fb0 = fo0.m2(ld1, ld3, ld4, fd0, fb1, lb0, fb0, fb1);
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
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought49.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    boolean lb2 = true;
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
}
