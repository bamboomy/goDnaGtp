package genetic;
import java.util.ArrayList;
class Thought75 extends Thought{
private static ArrayList<Thought75> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 308.7467929944769;
private double fd1 = 271.8722532076646;
private Thought fo0 = null;
private Thought fo1 = null;
Thought75 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought75 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought75 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought75 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought75 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo1 = Thought51.getInstance();
        fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought31.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
    Output.points[8][1] += fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    lb2 = !fb0;
    Thought lo4 = Thought58.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb2, fb0, fb1);
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
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought39.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    double ld2 = 652.251907380289;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][2] -= ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
    if (lb0) {
        fb0 = !fb1;
        Thought lo1 = Thought14.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
        } else if (fb1) {
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
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab1 = !ab2;
    double ld2 = 458.9246335203828;

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
    Thought lo0 = Thought2.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      ao1.m3();
}
    fb0 = fb1 || fb0;
    Output.points[8][3] -= fd0;
    fb1 = fb0 || fb1;
    double ld1 = 960.4093440302167;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[8][4] += fd1;
    ld1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = ld1 > fd0;
        fd1 = ld1 + fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    if (fb1) {
        fb0 = fb1 || fb0;
        Thought lo0 = Thought90.getInstance(ad2, ad3, ad4, fd0);
        } else {
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        boolean lb1 = false;
        double ld2 = 207.80836495020472;
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
    boolean lb0 = false;
    if (ab1) {
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        fb1 = lb0 && ab1;
        ab2 = fd0 > fd1;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        } else {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        lb0 = fd0 > fd1;
        ab1 = ab2 && ab3;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
                  ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = ad4 < fd0;
    lb1 = fd1 > ad1;
    ab1 = ad2 < ad3;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
    Thought lo2 = Thought31.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, lb1, ab1);
}
if(ao4 != null){
      ao4.m2();
}
    ad2 *= -1;
    double ld3 = 39.527639989014865;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    Thought lo4 = Thought12.getInstance(fo1, ao1, ao2, ao3);
    lb1 = ab1 && ab2;
    boolean lb5 = true;
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld3, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb5, ab1, ab2);
}
    ab3 = ad3 < ad4;
    Output.points[8][5] -= fd0;
    if (ab4) {
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
        Thought lo0 = Thought96.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    fb0 = !fb1;
    boolean lb2 = false;
    Output.points[8][6] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fd0 < fd1;
    if (lb2) {
        fd0 = fd1 + fd0;
        boolean lb3 = false;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb3);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
        lb3 = fd0 > fd1;
        Output.points[8][7] -= fd0;
        double ld4 = 85.73723492015003;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld4, fd0, fd1);
}
        if (lb1) {
            ld4 = fd0 - fd1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 *= -1;
    Thought lo1 = Thought7.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    Thought lo2 = Thought78.getInstance(ab1, ab2, ab3, ab4);
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo4 = Thought93.getInstance(fo0, fo1, fo0, fo1);
    lb3 = ab1 && ab2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, lb3, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    double ld5 = 476.22222030556435;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 903.378355840817;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        Output.points[8][8] += ad3;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld0, ad1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ad2 = ad3 + ad4;
        fd0 *= -1;
        fd1 = ld0 - ad1;
        boolean lb2 = false;
        lb2 = ad2 > ad3;
        Thought lo3 = Thought4.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb2);
        lb1 = ad1 > ad2;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, lb1, fb0);
}
        Output.points[0][0] += fd1;
if(fo1 != null){
          ld0 = fo1.m3(ad1, ad2, ad3, ad4);
}
        }
    double ld4 = 586.7042518597923;

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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        Thought lo0 = Thought90.getInstance(ab2, ab3, ab4, fb0);
        double ld1 = 485.3179808935624;
        fb1 = !ab1;
        ab2 = ab3 && ab4;
        ld1 = ad1 - ad2;
        boolean lb2 = true;
        ab4 = fb0 || fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        }
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    lb0 = fb0 || fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought3.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
    double ld2 = 140.43940512878072;

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
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = fb1 && fb0;
    Output.points[0][1] += fd1;
    fb1 = !fb0;
    Thought lo0 = Thought90.getInstance();
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[0][2] -= fd1;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    boolean lb2 = true;

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
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    boolean lb0 = true;
    double ld1 = 556.6735000443514;
    ab4 = fb0 || fb1;
    double ld2 = 99.255312642148;
    ld2 = fd0 + fd1;
    lb0 = ab1 && ab2;
if(ao2 != null){
      ld1 = ao2.m3();
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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ad1 - ad2;
    ab4 = fb0 || fb1;
    Thought lo1 = Thought43.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
    Output.points[0][3] -= ad1;
    ad2 *= -1;
    boolean lb2 = false;
    ab3 = ab4 && fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, lb2, ab1);
}
    ad3 = ad4 - fd0;
    ab2 = !ab3;
    boolean lb3 = false;
    fd1 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
        ab3 = ad3 < ad4;
        ab4 = fb0 && fb1;
        boolean lb4 = true;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
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
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 324.888635868575;
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb3 = true;
    ld2 *= -1;
    boolean lb4 = false;
    lb3 = !lb4;
    double ld5 = 897.8972386707081;
    Thought lo6 = Thought15.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
    Output.points[0][4] += ld5;
    Thought lo7 = Thought68.getInstance(fd0, fd1, ld2, ld5);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, ld5, fd0);
}
if(fo0 != null){
      lb3 = fo0.m2(lb4, fb0, fb1, lb0);
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
    Thought lo0 = Thought46.getInstance();
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    double ld1 = 647.5380875527155;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld1;
    Thought lo2 = Thought45.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    double ld3 = 171.251739713284;

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
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2();
}
    if (fb0) {
        Thought lo1 = Thought59.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
        Output.points[0][5] -= fd1;
        Thought lo2 = Thought8.getInstance(fo0, fo1, fo0, fo1);
        lb0 = fb0 || fb1;
        double ld3 = 706.3671980544435;
        ld3 = ad1 + ad2;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        Thought lo4 = Thought88.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
        ld3 = ad1 - ad2;
if(fo1 != null){
          fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ld3 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        } else if (fb1) {
        lb0 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m3();
}
        fb0 = fb1 && lb0;
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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
    Output.points[0][6] += fd1;
    fb0 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought62.getInstance(fd1, fd0, fd1, fd0);
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < fd0;
        Thought lo1 = Thought34.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        boolean lb2 = false;
if(fo0 != null){
          fd1 = fo0.m3(lb2, fb0, fb1, lb2);
}
        fb0 = fb1 && lb2;
        fb0 = !fb1;
        Thought lo3 = Thought59.getInstance();
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    boolean lb0 = true;
    Output.points[0][7] += ad2;
    ad3 *= -1;
    fb0 = fb1 && lb0;
    ad4 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        lb0 = ad3 < ad4;
        lb1 = fd0 < fd1;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, lb1, fb0);
}
        ad1 *= -1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        boolean lb2 = false;
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
        Thought lo3 = Thought69.getInstance(fb0, fb1, lb2, lb0);
        ad4 *= -1;
        fd0 = fd1 - ad1;
        lb1 = ad2 < ad3;
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        Thought lo4 = Thought61.getInstance(ad4, fd0, fd1, ad1, lb2, lb0, lb1, fb0);
        double ld5 = 921.1495049823211;
        fb1 = lb2 && lb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[0][8] -= fd0;
    ab3 = ab4 && fb0;
    fd1 = fd0 + fd1;
    fb1 = !ab1;
    Thought lo0 = Thought88.getInstance(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    Thought lo1 = Thought62.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Output.points[1][0] -= fd0;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao4.m1(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought15.getInstance();
    double ld3 = 9.874317065937683;
    for(int i0=0; i0<10; i0++){
        }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo4 = Thought41.getInstance(ao1, ao2, ao3, ao4);
    Output.points[1][1] += fd1;

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
    Output.points[1][2] += ad2;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought72.getInstance(ad2, ad3, ad4, fd0);
    double ld1 = 113.6876239444511;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
}
    ad2 *= -1;
    ab1 = ad3 > ad4;
        Thought lo2 = Thought93.getInstance(ab2, ab3, ab4, fb0);
    fd0 *= -1;
    double ld3 = 681.1955876271668;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(fd0, fd1, ld1, ld3, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    Thought lo4 = Thought75.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo5 = Thought45.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);

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
    double ld0 = 10.289736316492574;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought2.getInstance();
    boolean lb2 = false;
    Thought lo3 = Thought52.getInstance(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb2, fb0, fb1);
}
    fd1 *= -1;
    boolean lb4 = true;
    lb2 = lb4 || fb0;
    Thought lo5 = Thought63.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, lb4, fb0);
    fb1 = !lb2;
    Thought lo6 = Thought30.getInstance(ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    lb4 = fd1 < ld0;
        fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
    Thought lo7 = Thought65.getInstance(fb1, lb2, lb4, fb0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo8 = Thought38.getInstance(ld0, fd0, fd1, ld0, lb2, lb4, fb0, fb1);
    fd0 *= -1;
    double ld9 = 810.5039693987184;
    lb2 = fd0 < fd1;
    ld0 *= -1;
if(fo1 != null){
      ld9 = fo1.m3(fo0, fo1, fo0, fo1);
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
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought94.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = false;
    fd1 = fd0 - fd1;
    Output.points[1][3] += fd0;
    ab3 = ab4 && fb0;
    fb1 = lb0 && lb2;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb3, lb4, ab1, ab2);
}
    fd1 *= -1;
    ab3 = ab4 || fb0;
    Thought lo5 = Thought43.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
    lb4 = fd1 < fd0;
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    Thought lo0 = Thought72.getInstance(ad4, fd0, fd1, ad1);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
        fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought0.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = ad1 < ad2;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    Output.points[1][4] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = ad3 > ad4;
    double ld0 = 974.2035151240119;
    fb0 = !fb1;
if(fo0 != null){
      ad4 = fo0.m3();
}
    if (ab1) {
        ab2 = fd0 < fd1;
        } else if (ab3) {
if(fo0 != null){
          fo1 = fo0.m4(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        ab4 = fb0 || fb1;
        boolean lb1 = false;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb1, lb2, ab1, ab2);
}
        ad1 = ad2 - ad3;
        Output.points[1][5] += ad4;
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
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought38.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fb1 && fb0;
    Thought lo1 = Thought63.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = fd1 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;

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
    Output.points[1][6] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    if (ab1) {
if(ao3 != null){
          ab2 = ao3.m2();
}
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Thought lo0 = Thought68.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        boolean lb1 = false;
        ab4 = !fb0;
        boolean lb2 = true;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
        ab1 = fd1 > fd0;
if(ao3 != null){
          fd1 = ao3.m3(fd0, fd1, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    fd0 = fd1 - ad1;
    double ld0 = 399.00500501107706;

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[1][7] += fd1;
    Output.points[1][8] += fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought74.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought40.getInstance();
    boolean lb2 = true;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    Thought lo3 = Thought50.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
    Output.points[2][0] += fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    Output.points[2][1] -= fd1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 && fb0;
    double ld1 = 40.90913847914973;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
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
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought16.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought37.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    Output.points[2][2] += fd0;
    fd1 = fd0 - fd1;
    double ld2 = 462.4799127051161;
    fb0 = !fb1;
    Output.points[2][3] += ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fb0 = fd1 < ld2;
    fb1 = fb0 && fb1;

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
