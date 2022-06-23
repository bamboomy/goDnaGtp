package genetic;
import java.util.ArrayList;
class Thought21 extends Thought{
private static ArrayList<Thought21> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 610.3022321022758;
private double fd1 = 816.5439339137464;
private Thought fo0 = null;
private Thought fo1 = null;
Thought21 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought21 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought21 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought21 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought21 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought34.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    Output.points[5][5] += fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought8.getInstance(fo1, fo0, fo1, fo0);
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
    double ld1 = 942.3933683099774;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
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
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought77.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 *= -1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    ab1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ab2 = !ab3;
if(fo1 != null){
      ad2 = fo1.m3(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    boolean lb1 = false;
    ad1 *= -1;
    Thought lo2 = Thought48.getInstance(fo1, fo0, fo1, fo0);
    ad2 = ad3 + ad4;

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
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought95.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    Thought lo1 = Thought32.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    if (fb1) {
        for(int i0=0; i0<10; i0++){
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
    lb1 = !lb2;
    Thought lo3 = Thought44.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
    lb2 = fb0 && fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, lb1, lb2, fb0);
}
    Output.points[5][6] += ad4;
    fd0 = fd1 - ad1;
    fb1 = lb0 || lb1;

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
    fd1 *= -1;
    Thought lo0 = Thought33.getInstance();
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
    Thought lo2 = Thought25.getInstance(lb1, ab1, ab2, ab3);
    boolean lb3 = true;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, lb3, ab1, ab2, ab3);
}
    double ld4 = 307.10180845570505;
    fd0 = fd1 + ld4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
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
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    Thought lo0 = Thought63.getInstance(ad3, ad4, fd0, fd1);
    Thought lo1 = Thought71.getInstance(ab1, ab2, ab3, ab4);
    ad1 = ad2 - ad3;
    Output.points[5][7] += ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
    double ld3 = 709.9048351981728;
    ab4 = ld3 > ad1;
    boolean lb4 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
}
    boolean lb5 = true;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    lb4 = lb5 && ab1;
    ab2 = ab3 && ab4;
    fb0 = fd1 < ld3;
    Thought lo6 = Thought10.getInstance(ao2, ao3, ao4, fo0);
    Thought lo7 = Thought64.getInstance(ad1, ad2, ad3, ad4, fb1, lb2, lb4, lb5);
    ab1 = fd0 < fd1;
    Thought lo8 = Thought13.getInstance();
    ld3 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ld3 + ad1;

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
    Output.points[5][8] -= fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (lb0) {
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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    Thought lo0 = Thought58.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
          ab1 = fo0.m2();
}
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
            ab3 = !ab4;
            fb0 = fd0 < fd1;
            fb1 = fd0 > fd1;
}}
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
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = ad1 < ad2;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    lb0 = lb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && lb0;
    Thought lo3 = Thought15.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, fb0, fb1);
}
    ad1 = ad2 - ad3;
    Output.points[6][0] += ad4;

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
    ad1 *= -1;
    double ld0 = 359.3359529228078;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[6][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ad4 *= -1;
    ab4 = fb0 && fb1;
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    lb1 = ad1 > ad2;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1();
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      fb1 = ao4.m2(fd0, fd1, fd0, fd1);
}
    Output.points[6][2] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought96.getInstance(fo1, ao1, ao2, ao3);
    double ld2 = 481.69146748728343;
    boolean lb3 = false;
    fb0 = !fb1;
    Output.points[6][3] += ld2;
if(ao4 != null){
      ao4.m2(ad1, ad2, ad3, ad4, lb0, lb3, fb0, fb1);
}
    boolean lb4 = false;
    lb0 = !lb3;
    fd0 = fd1 - ld2;
    lb4 = fb0 && fb1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = ad4 < fd0;
if(ao1 != null){
      ao1.m1(fd1, ld2, ad1, ad2);
}
    double ld5 = 900.6199497552138;
    Output.points[6][4] -= ad2;

Thought.STACK_COUNTER++;
return lb3;
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
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought83.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought12.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Output.points[6][5] -= fd0;
    boolean lb2 = true;
    lb2 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    boolean lb3 = true;
    double ld4 = 12.851441596589556;
    double ld5 = 305.77688180502173;
    boolean lb6 = true;
    double ld7 = 925.8165896366448;
    lb6 = ld4 < ld5;
    ld7 = fd0 - fd1;
    Thought lo8 = Thought63.getInstance(ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, ld5, ld7, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    ab2 = ab3 && ab4;
    double ld0 = 326.4237590138398;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab2 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab1 = ab2 || ab3;
    if (ab4) {
        fb0 = fb1 && ab1;
        ab2 = fd0 < fd1;
        double ld1 = 771.7699726179817;
if(ao3 != null){
          ao2 = ao3.m4(ld1, ld0, ad1, ad2);
}
        Thought lo2 = Thought50.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        ab2 = ab3 || ab4;
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
    fd0 *= -1;
    Thought lo0 = Thought75.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 51.65581736495455;
    fb1 = fd0 < fd1;
    Output.points[6][6] -= ld1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fb1 = !fb0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = fd0 < fd1;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = !ab3;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 878.1487238322927;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    double ld1 = 103.55873691237265;
    Output.points[6][7] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(ld0, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought21.getInstance();
    Thought lo3 = Thought37.getInstance(ld0, ld1, fd0, fd1);
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
    ld0 = ld1 + fd0;
    ab4 = fd1 < ld0;

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
    Thought lo0 = Thought27.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd1 *= -1;
    fb0 = fb1 || lb1;

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
if(fo1 != null){
          ad2 = fo1.m3();
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    Thought lo1 = Thought22.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
    boolean lb2 = true;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][8] += fd0;
    fb1 = fb0 && fb1;
    double ld0 = 8.501280867834486;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    fd1 = ld0 - fd0;
if(ao4 != null){
      lb1 = ao4.m2(fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    fb1 = !lb1;

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
    fb1 = !fb0;
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    double ld1 = 762.3804225408406;
    lb0 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    boolean lb2 = true;
    lb2 = ad4 < fd0;
    fb0 = fd1 > ld1;
    fb1 = lb0 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
    fb0 = fd0 > fd1;
    boolean lb3 = true;
    fb0 = fb1 && lb0;
    ld1 *= -1;
    Thought lo4 = Thought72.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, lb2, lb3, fb0);
}
    fb1 = ld1 < ad1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb0, lb2, lb3, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
    double ld0 = 285.4303502947669;
    boolean lb1 = true;
    Output.points[7][0] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought75.getInstance();
    Thought lo3 = Thought95.getInstance(ld0, fd0, fd1, ld0);
    double ld4 = 485.54339030862405;
if(ao3 != null){
      ao3.m3(ab4, fb0, fb1, lb1);
}
    ab1 = ld4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld4, fd0);
}
    ab2 = ab3 && ab4;
    Thought lo5 = Thought67.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ld4, fd0, fb0, fb1, lb1, ab1);
    fd1 = ld0 - ld4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;
    Thought lo6 = Thought30.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      lb1 = fo0.m2(ld4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ld4 = fo1.m3();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = !ab2;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    Output.points[7][1] += fd1;
    double ld1 = 308.28662917654924;
    ld1 = ad1 + ad2;
    ab1 = !ab2;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    if (ab2) {
        ld1 = ad1 - ad2;
        ad3 *= -1;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 || ab3;
        Thought lo2 = Thought70.getInstance(ao2, ao3, ao4, fo0);
        ad4 = fd0 - fd1;
        boolean lb3 = true;
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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            fd1 = fd0 - fd1;
            boolean lb0 = false;
            fd0 = fd1 - fd0;
if(fo0 != null){
              fo1 = fo0.m4();
}
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
            boolean lb1 = false;
            Output.points[7][2] += fd0;
if(fo1 != null){
              fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
            lb1 = fb0 || fb1;
            lb0 = !lb1;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    Thought lo0 = Thought72.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = ab1 && ab2;
    ab3 = fd1 > fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb1 = lb2 || lb3;
    ab1 = fd1 > fd0;
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;
    boolean lb4 = false;
    Thought lo5 = Thought28.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    lb3 = lb4 && ab1;
    ab2 = ab3 && ab4;
    fd0 *= -1;
    fb0 = fb1 || lb1;
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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought11.getInstance();
    ad4 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2);
}
        fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = !fb0;
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    fb0 = ad3 > ad4;
        boolean lb1 = true;
    Output.points[7][3] += fd0;
        Thought lo2 = Thought35.getInstance(fb0, fb1, lb1, fb0);

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
    Thought lo0 = Thought60.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    Output.points[7][4] -= ad3;
    ad4 *= -1;
    ab1 = !ab2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Output.points[7][5] -= ad4;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
    lb2 = lb3 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
        boolean lb4 = true;
        Thought lo5 = Thought13.getInstance();
        Thought lo6 = Thought72.getInstance(ad4, fd0, fd1, ad1);
        Output.points[7][6] -= ad2;
        boolean lb7 = false;
        boolean lb8 = false;
if(fo0 != null){
          ad3 = fo0.m3(lb7, lb8, lb1, lb2);
}
        ad4 = fd0 - fd1;
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
    fd0 *= -1;
    fd1 *= -1;
    fb1 = fd0 < fd1;
    double ld0 = 695.5842353760787;
    fb0 = ld0 < fd0;
    Output.points[7][7] -= fd1;
    ld0 = fd0 - fd1;
    fb1 = fb0 && fb1;
    fb0 = ld0 > fd0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = !fb1;
if(ao4 != null){
      fb0 = ao4.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 + fd1;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    Output.points[7][8] += fd0;
    fb1 = !fb0;
    Thought lo0 = Thought99.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
    Output.points[8][0] += fd1;
        for(int i0=0; i0<10; i0++){
        fb1 = ad1 < ad2;
        ad3 *= -1;
        fb0 = fb1 || fb0;
        boolean lb1 = false;
        boolean lb2 = true;
if(fo0 != null){
          ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb1);
}
        lb2 = ad3 > ad4;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
        Output.points[8][1] += fd0;
if(ao2 != null){
          ao2.m2(fd1, ad1, ad2, ad3, fb1, lb1, lb2, fb0);
}
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought97.getInstance();
    ab2 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    fd1 *= -1;
    fd0 *= -1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    Output.points[8][2] -= fd1;
    Output.points[8][3] -= fd0;
    Output.points[8][4] += fd1;
    double ld1 = 778.4283684696381;
    ab2 = !ab3;

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
    ad1 *= -1;
    ab4 = fb0 || fb1;
    Output.points[8][5] -= ad2;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    boolean lb0 = false;
    ab2 = !ab3;
    boolean lb1 = true;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought73.getInstance(fo1, ao1, ao2, ao3);
        ad3 = ad4 + fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        Thought lo4 = Thought72.getInstance(ad4, fd0, fd1, ad1);
        double ld5 = 833.8940001730057;
        ad1 = ad2 + ad3;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ad4 = ao2.m3(ab1, ab2, ab3, ab4);
}
            fd0 = fd1 + ld5;
            }
        fb0 = fb1 && lb0;
        boolean lb6 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld5, ad1, lb0, lb1, lb2, ab1);
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
    fb1 = fd0 > fd1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    double ld0 = 512.0450369743016;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
    fb0 = fd0 < fd1;
    fb1 = !lb1;
    Output.points[8][6] -= ld0;
    double ld3 = 341.43079434211774;
    boolean lb4 = false;
if(fo1 != null){
      lb2 = fo1.m2(ld3, fd0, fd1, ld0, lb4, fb0, fb1, lb1);
}
    ld3 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
        ld0 *= -1;
    lb2 = lb4 && fb0;
    boolean lb5 = true;
        fb0 = ld3 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld3, fd0);
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
    fb1 = fd1 > fd0;
    Thought lo0 = Thought51.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = fd1 > fd0;
    lb2 = !fb0;

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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought80.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
        Output.points[8][7] += fd0;
    fd1 *= -1;
    lb1 = !fb0;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    lb3 = fb0 && fb1;
    lb1 = fd1 < fd0;
    Thought lo4 = Thought18.getInstance(lb2, lb3, fb0, fb1);
    boolean lb5 = false;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[8][8] -= fd0;
    boolean lb6 = false;
    double ld7 = 115.54338093508927;

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
